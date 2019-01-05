package com.app.devchat.data.Network;

import com.app.devchat.data.Message;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Date;

/**
 * Provides the methods contract for interacting with the {@link AppNetworkHelper}
 */
public interface NetworkHelper {

    void getNewMessagesFromBackend(Date date, EventListener<QuerySnapshot> snapshotEventListener);

    void getMessagesFromBackend(OnSuccessListener<QuerySnapshot> onSuccessListener);

    void sendMessagesToBackend(ArrayList<Message> messages);
}
