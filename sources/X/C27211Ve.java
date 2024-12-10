package X;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.1Ve  reason: invalid class name and case insensitive filesystem */
public final class C27211Ve {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass122 A02;
    public final C18100vl A03 = new C18110vm(C27221Vf.A00);
    public final AnonymousClass1M9 A04;
    public final AnonymousClass11C A05;
    public final C219217x A06;
    public final C22621Co A07;
    public final AnonymousClass1CJ A08;

    public C27211Ve(AnonymousClass11S r3, AnonymousClass1M9 r4, AnonymousClass11C r5, AnonymousClass11P r6, C219217x r7, C22621Co r8, AnonymousClass1CJ r9, AnonymousClass122 r10) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r9, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r4, 5);
        C18070vi.A0d(r5, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r7, 8);
        this.A01 = r6;
        this.A00 = r3;
        this.A08 = r9;
        this.A07 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r10;
        this.A06 = r7;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 != 0) goto L_0x00fd
            java.lang.String r1 = "android.nfc.action.NDEF_DISCOVERED"
            java.lang.String r0 = r10.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r4 = "NfcChatHandlerImpl/processNfcIntent"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.String r0 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r1 = r10.getParcelableArrayExtra(r0)
            if (r1 == 0) goto L_0x00fd
            int r0 = r1.length
            if (r0 == 0) goto L_0x00f5
            r5 = r1[r7]
            boolean r0 = r5 instanceof android.nfc.NdefMessage
            r6 = 0
            if (r0 == 0) goto L_0x00fd
            android.nfc.NdefMessage r5 = (android.nfc.NdefMessage) r5
            if (r5 == 0) goto L_0x00fd
            android.nfc.NdefRecord[] r0 = r5.getRecords()
            r0 = r0[r7]
            byte[] r2 = r0.getType()
            X.C18070vi.A0X(r2)
            X.0vl r3 = r8.A03
            java.lang.Object r0 = r3.getValue()
            X.C18070vi.A0X(r0)
            java.nio.charset.Charset r0 = (java.nio.charset.Charset) r0
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r0)
            java.lang.String r0 = "application/com.whatsapp.chat"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fd
            android.nfc.NdefRecord[] r0 = r5.getRecords()
            r0 = r0[r7]
            byte[] r2 = r0.getPayload()
            X.C18070vi.A0X(r2)
            java.lang.Object r1 = r3.getValue()
            X.C18070vi.A0X(r1)
            java.nio.charset.Charset r1 = (java.nio.charset.Charset) r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0088 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "jid"
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x0088 }
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0086 }
            goto L_0x0092
        L_0x0086:
            r0 = move-exception
            goto L_0x008e
        L_0x0088:
            r0 = move-exception
            r3 = r6
            r2 = r6
            goto L_0x008e
        L_0x008c:
            r0 = move-exception
            r2 = r6
        L_0x008e:
            com.whatsapp.util.Log.e(r4, r0)
            r1 = r6
        L_0x0092:
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r4 = r0.A02(r3)
            if (r4 == 0) goto L_0x00d4
            if (r2 == 0) goto L_0x00d4
            X.1CJ r0 = r8.A08
            boolean r0 = r0.A0P(r4)
            if (r0 != 0) goto L_0x00bd
            X.1M9 r0 = r8.A04
            X.1E7 r0 = r0.A0E(r4)
            X.1Co r2 = r8.A07
            if (r0 == 0) goto L_0x00b2
            X.2lf r0 = r0.A0H
            if (r0 != 0) goto L_0x00b3
        L_0x00b2:
            r6 = r1
        L_0x00b3:
            r0 = 5
            X.3Bz r5 = new X.3Bz
            r5.<init>(r8, r4, r0)
            r3 = 0
            r2.A05(r3, r4, r5, r6, r7)
        L_0x00bd:
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Intent r2 = r0.A1w(r9, r4, r7)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "NewChatNfc:processNfcIntent"
            X.11P r0 = r8.A01
            X.C60442o2.A00(r2, r0, r1)
            r9.startActivity(r2)
            return
        L_0x00d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NfcChatHandlerImpl/processNfcIntent jid is invalid: "
            r1.append(r0)
            java.lang.String r0 = X.C22971Dz.A06(r4)
            r1.append(r0)
            java.lang.String r0 = " id: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00f5:
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27211Ve.A01(android.content.Context, android.content.Intent):void");
    }

    public void A00(Activity activity) {
        if (!AnonymousClass112.A0A() && this.A05.A0P("android.hardware.nfc") && this.A06.A02("android.permission.NFC") == 0) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
            if (defaultAdapter != null) {
                try {
                    NfcAdapter.class.getMethod("setNdefPushMessageCallback", new Class[]{NfcAdapter.CreateNdefMessageCallback.class, Activity.class, Activity[].class}).invoke(defaultAdapter, new Object[]{new C64282uW(this, 1), activity, new Activity[0]});
                } catch (IllegalAccessException | IllegalStateException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                    Log.i("NfcChatHandlerImpl/onActivityCreated ", e);
                }
            }
            if ("android.nfc.action.NDEF_DISCOVERED".equals(activity.getIntent().getAction())) {
                Intent intent = activity.getIntent();
                C18070vi.A0X(intent);
                A01(activity, intent);
            }
        }
    }
}
