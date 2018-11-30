package com.tw.test.androidunittesting.data;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

public class RepositoryManager {
    private static IPaymentRepository repository = null;

    public synchronized static IPaymentRepository getInMemoryRepoInstance(@NonNull IPaymentRepository notesServiceApi) {
        checkNotNull(notesServiceApi);
        if (null == repository) {
//            repository = new InMemoryNotesRepository(notesServiceApi);
        }
        return repository;
    }

}
