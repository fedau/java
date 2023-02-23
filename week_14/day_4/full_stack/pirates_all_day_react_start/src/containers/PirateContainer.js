import React, { useEffect, useState } from 'react';
import { Route, Routes, useParams } from 'react-router-dom';
import PirateList from '../components/pirates/PirateList';
import PirateDetail from '../components/pirates/PirateDetail';
import PirateForm from '../components/pirates/PirateForm';
import Request from '../helpers/request';

const PirateContainer = () => {

  const [pirates, setPirates] = useState([])
  const [ships, setShips] = useState([])
  const [raids, setRaids] = useState([])

  useEffect(() => {
    const request = new Request();
    const piratePromise = request.get('/api/pirates');
    const shipPromise = request.get('/api/ships');
    const raidPromise = request.get('/api/raids');

    Promise.all([piratePromise, shipPromise, raidPromise])
      .then((data) => {
        setPirates(data[0])
        setShips(data[1])
        setRaids(data[2])
      })
  }, [])

  const findPirateById = (id) => {
    return pirates.find((pirate) => {
      return pirate.id === parseInt(id);
    })
  }

  const PirateDetailWrapper = () => {
    const { id } = useParams();
    let foundPirate = findPirateById(id)
    return <PirateDetail pirate={foundPirate} handleDelete={handleDelete} />;
  };

  const handleDelete = (id) => {
    const request = new Request();
    const url = '/api/pirates/' + id;
    request.delete(url).then(() => {
      window.location = '/pirates';

    })
  }

  const handlePost = (pirate) => {
    // TODO: use API to create pirate
    window.location = '/pirates'
  };

  return (
    <Routes>
      <Route path="/new" element={
        <PirateForm ships={ships} onCreate={handlePost} />
      } />
      <Route path="/:id" element={
        <PirateDetailWrapper />
      } />
      <Route path="/" element={<PirateList pirates={pirates} />} />
    </Routes>
  )

}

export default PirateContainer;
