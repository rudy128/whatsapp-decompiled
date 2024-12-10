package org.npci.upi.security.services;

import android.os.IInterface;

public interface CLRemoteService extends IInterface {
    void BKn(String str);

    String BOR(String str, String str2);

    void BPh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver);

    boolean CDr(String str, String str2, String str3, String str4, String str5);
}
