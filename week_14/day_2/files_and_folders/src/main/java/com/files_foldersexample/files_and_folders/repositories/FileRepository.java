package com.files_foldersexample.files_and_folders.repositories;

import com.files_foldersexample.files_and_folders.models.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<Files, Long> {
}
