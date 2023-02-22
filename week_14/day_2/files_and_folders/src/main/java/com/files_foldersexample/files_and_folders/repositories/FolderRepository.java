package com.files_foldersexample.files_and_folders.repositories;

import com.files_foldersexample.files_and_folders.models.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folders, Long> {
}
