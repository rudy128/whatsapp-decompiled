package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2M7  reason: invalid class name */
public class AnonymousClass2M7 extends AnonymousClass2S7 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass2M7(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A00(C29621ca r9) {
        int i;
        String str;
        if (this.A00 != 0) {
            super.A00(r9);
            return;
        }
        Pair A012 = C60482o6.A01(r9);
        if (A012 != null) {
            i = AnonymousClass000.A0M(A012.first);
            if (i == 207) {
                Iterator A03 = C29621ca.A03(r9, "error");
                while (A03.hasNext()) {
                    Iterator A032 = C29621ca.A03(C17880vN.A0a(A03), "error");
                    while (A032.hasNext()) {
                        C29621ca A0a = C17880vN.A0a(A032);
                        String A0Q = A0a.A0Q("code", (String) null);
                        String A0Q2 = A0a.A0Q("text", (String) null);
                        if (A0Q != null) {
                            int A013 = C20099A7c.A01(A0Q, 0);
                            AnonymousClass37L r1 = ((C62642rj) this.A01).A08;
                            Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-error");
                            AnonymousClass3LB r2 = r1.A00;
                            Bundle A0D = C17880vN.A0D();
                            A0D.putInt("errorCode", A013);
                            A0D.putString("errorText", A0Q2);
                            C17890vO.A0o(r2, A0D, 196);
                        }
                    }
                }
                return;
            }
        } else {
            i = 0;
        }
        AnonymousClass37L r12 = ((C62642rj) this.A01).A08;
        if (A012 != null) {
            str = (String) A012.second;
        } else {
            str = null;
        }
        Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-error");
        AnonymousClass3LB r22 = r12.A00;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("errorCode", i);
        A0D2.putString("errorText", str);
        C17890vO.A0o(r22, A0D2, 78);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r13v2, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: type inference failed for: r15v1, types: [java.lang.Object, X.4rF] */
    public void A01(C29621ca r30) {
        byte b;
        byte[] bArr;
        C54492eE r16;
        C29621ca r8 = r30;
        switch (this.A00) {
            case 0:
                AnonymousClass37L r1 = ((C62642rj) this.A01).A08;
                Log.i("ConnectionThreadRequestsImpl/on-set-pre-key-success");
                r1.A00.CAe(Message.obtain((Handler) null, 0, 77, 0));
                return;
            case 1:
                C29621ca A0L = r8.A0L("list");
                DeviceJid[] deviceJidArr = (DeviceJid[]) this.A02;
                int length = deviceJidArr.length;
                HashSet hashSet = new HashSet(length);
                HashMap hashMap = new HashMap(length);
                C29621ca[] r10 = A0L.A02;
                int i = 0;
                if (r10 != null) {
                    Arrays.sort(r10, new C21486Akr(44));
                    ArrayList A13 = AnonymousClass000.A13();
                    int length2 = r10.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        C29621ca r82 = r10[i2];
                        DeviceJid deviceJid = (DeviceJid) r82.A0G(DeviceJid.class, "jid");
                        C29621ca A0K = r82.A0K("error");
                        if (A0K != null) {
                            int A0B = A0K.A0B(A0K.A0P("code"), "code");
                            hashSet.add(deviceJid);
                            C17890vO.A0z(deviceJid, hashMap, A0B);
                        } else {
                            C29621ca A0L2 = r82.A0L("identity");
                            C29621ca A0K2 = r82.A0K("device-identity");
                            C29621ca A0L3 = r82.A0L("registration");
                            C29621ca A0K3 = r82.A0K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0K3 == null) {
                                b = 5;
                            } else {
                                byte[] bArr2 = A0K3.A01;
                                if (bArr2 == null || bArr2.length != 1) {
                                    throw AnonymousClass1UI.A01("type node should contain exactly 1 byte");
                                }
                                b = bArr2[i];
                            }
                            C29621ca A0K4 = r82.A0K("key");
                            if (A0K4 != null) {
                                bArr = null;
                                r16 = new C54492eE(A0K4.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_ID).A01, A0K4.A0L("value").A01, (byte[]) null);
                            } else {
                                bArr = null;
                                r16 = null;
                            }
                            C29621ca A0L4 = r82.A0L("skey");
                            C29621ca A0L5 = A0L4.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            C29621ca A0L6 = A0L4.A0L("value");
                            C29621ca A0L7 = A0L4.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                            byte[] bArr3 = A0L2.A01;
                            byte[] bArr4 = A0L3.A01;
                            if (A0K2 != null) {
                                bArr = A0K2.A01;
                            }
                            A13.add(new C55852gT(deviceJid, r16, new C54492eE(A0L5.A01, A0L6.A01, A0L7.A01), bArr3, bArr4, bArr, b));
                            hashSet.add(deviceJid);
                        }
                        i2++;
                        i = 0;
                    }
                    if (!A13.isEmpty()) {
                        AnonymousClass37L r2 = ((C62642rj) this.A01).A08;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-success");
                        C17890vO.A0o(r2.A00, A13, 74);
                    }
                }
                SparseArray sparseArray = new SparseArray();
                while (i < length) {
                    DeviceJid deviceJid2 = deviceJidArr[i];
                    if (!hashSet.contains(deviceJid2)) {
                        AnonymousClass37L r22 = ((C62642rj) this.A01).A08;
                        Log.i("ConnectionThreadRequestsImpl/on-get-pre-key-none");
                        AnonymousClass3LB r4 = r22.A00;
                        Bundle A0D = C17880vN.A0D();
                        AnonymousClass2U5.A00(A0D, deviceJid2, "jid");
                        C17890vO.A0o(r4, A0D, 75);
                    }
                    if (hashMap.containsKey(deviceJid2)) {
                        int A0M = AnonymousClass000.A0M(hashMap.get(deviceJid2));
                        List list = (List) sparseArray.get(A0M);
                        if (list != null) {
                            list.add(deviceJid2);
                        } else {
                            ArrayList A132 = AnonymousClass000.A13();
                            A132.add(deviceJid2);
                            sparseArray.put(A0M, A132);
                        }
                    }
                    i++;
                }
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((C62642rj) this.A01).A08.A02((DeviceJid[]) ((List) sparseArray.valueAt(i3)).toArray(new DeviceJid[0]), sparseArray.keyAt(i3));
                }
                return;
            default:
                C20121A8g a8g = (C20121A8g) this.A02;
                C18070vi.A0e(r8, 1, a8g);
                C29621ca.A04(r8, "iq");
                C29621ca BVP = a8g.BVP();
                ? obj = new Object();
                C61012oy r23 = C61012oy.A00;
                if (new C21289Aha(BVP, r23, 25).BCF(r8, obj) != null) {
                    ArrayList A08 = obj.A08(r8, new C21285AhW(r23, 3), new String[]{"config"}, 0, 2);
                    if (A08 != null) {
                        AnonymousClass37L r0 = ((C62642rj) this.A01).A08;
                        ? obj2 = new Object();
                        ? obj3 = new Object();
                        ? obj4 = new Object();
                        ? obj5 = new Object();
                        ? obj6 = new Object();
                        ? obj7 = new Object();
                        ? obj8 = new Object();
                        Iterator it = A08.iterator();
                        while (it.hasNext()) {
                            ((AnonymousClass3LS) ((AnonymousClass9DM) it.next()).A00).BAb(new C198619yd(obj2, obj5, obj3, obj4, obj6, obj7, obj8));
                        }
                        Log.i("ConnectionThreadRequestsImpl/client_config");
                        AnonymousClass3LB r24 = r0.A00;
                        Bundle A0D2 = C17880vN.A0D();
                        A0D2.putString("gcmToken", (String) obj2.element);
                        A0D2.putString("fbnsToken", (String) obj3.element);
                        A0D2.putString("mutedChatsHash", (String) obj4.element);
                        A0D2.putString("appMuteConfig", (String) obj5.element);
                        A0D2.putString("num_acc", (String) obj6.element);
                        A0D2.putString("pkey", (String) obj7.element);
                        A0D2.putString("voip_payload_type", (String) obj8.element);
                        C17890vO.A0o(r24, A0D2, 6);
                        return;
                    }
                    throw AnonymousClass1O9.A00(obj);
                }
                throw AnonymousClass1O9.A00(obj);
        }
    }
}
