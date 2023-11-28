package com.example.transitmate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.*;
import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class Messages extends Fragment {

    static ArrayList<MessagesListItem> chats;

    public Messages() {
        chats = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messages, container, false);
    }
}