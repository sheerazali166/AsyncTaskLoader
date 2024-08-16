package com.example.asynctask_loader;

// TODO: Created by Sheeraz 16/8/2024

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;

public class NamesAsyncTaskLoader extends AsyncTaskLoader<ArrayList<String>> {

    public NamesAsyncTaskLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public ArrayList<String> loadInBackground() {

        return loadNamesFromDatabase();
    }

    // TODO: This method simulates a call to a local database
    private ArrayList<String> loadNamesFromDatabase() {

        ArrayList<String> namesArrayList = new ArrayList<String>();
        namesArrayList.add("John");
        namesArrayList.add("Marry");
        namesArrayList.add("Joseph");
        namesArrayList.add("Noah");
        namesArrayList.add("Emma");

        return namesArrayList;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
