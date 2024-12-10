package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1fR  reason: invalid class name and case insensitive filesystem */
public class C31361fR {
    public final AnonymousClass118 A00;
    public final AnonymousClass1SG A01;
    public final AnonymousClass122 A02;
    public final C24751Ln A03;
    public final AnonymousClass1RL A04;
    public final AnonymousClass1PQ A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0084, B:40:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r13 = this;
            r2 = 0
            r5 = 0
            java.lang.String r0 = "changenumbermanager/sendchangenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11S r0 = r13.A07
            com.whatsapp.Me r4 = r0.A07()
            X.C17960vV.A07(r4)
            java.lang.String r3 = r4.jabber_id
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.118 r0 = r13.A00
            android.content.Context r0 = r0.A00
            java.io.File r6 = r0.getFilesDir()
            java.lang.String r0 = "change_number_contacts.json"
            java.io.File r1 = new java.io.File
            r1.<init>(r6, r0)
            boolean r0 = r1.exists()
            r12 = 0
            if (r0 == 0) goto L_0x00c8
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b2, IOException -> 0x00af }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00b2, IOException -> 0x00af }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a4 }
            r7.<init>(r6)     // Catch:{ all -> 0x00a4 }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x0097 }
            r8.<init>(r7)     // Catch:{ all -> 0x0097 }
            r8.beginObject()     // Catch:{ all -> 0x008d }
            r11 = 0
            r10 = r2
            r9 = r2
        L_0x0042:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r8.nextName()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "old_jid"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0059
            java.lang.String r10 = r8.nextString()     // Catch:{ all -> 0x008d }
            goto L_0x0042
        L_0x0059:
            java.lang.String r0 = "notify_jids"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0042
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x008d }
            r9.<init>()     // Catch:{ all -> 0x008d }
            r8.beginArray()     // Catch:{ all -> 0x008d }
        L_0x0069:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r8.nextString()     // Catch:{ all -> 0x008d }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x008d }
            r9.add(r0)     // Catch:{ all -> 0x008d }
            goto L_0x0069
        L_0x007a:
            if (r10 == 0) goto L_0x0081
            if (r9 == 0) goto L_0x0081
            r11 = 1
            r5 = r10
            r2 = r9
        L_0x0081:
            r8.close()     // Catch:{ all -> 0x008b }
            r7.close()     // Catch:{ all -> 0x00a2 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b9 }
            goto L_0x00bf
        L_0x008b:
            r1 = move-exception
            goto L_0x0099
        L_0x008d:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0092:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0097 }
        L_0x0096:
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            r11 = 0
        L_0x0099:
            r7.close()     // Catch:{ all -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00a2 }
        L_0x00a1:
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            goto L_0x00a6
        L_0x00a4:
            r1 = move-exception
            r11 = 0
        L_0x00a6:
            r6.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b9 }
        L_0x00ae:
            throw r1     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b9 }
        L_0x00af:
            r1 = move-exception
            r11 = 0
            goto L_0x00ba
        L_0x00b2:
            r1 = move-exception
            r11 = 0
            goto L_0x00b6
        L_0x00b5:
            r1 = move-exception
        L_0x00b6:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/notFoundJson "
            goto L_0x00bc
        L_0x00b9:
            r1 = move-exception
        L_0x00ba:
            java.lang.String r0 = "ChangeNumberManager/getChangeNumberContacts/ioErrorJson "
        L_0x00bc:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00bf:
            if (r11 == 0) goto L_0x00c8
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x00c8
            r12 = 1
        L_0x00c8:
            X.00H r0 = r13.A08
            java.lang.Object r0 = r0.get()
            X.1pj r0 = (X.C37551pj) r0
            java.util.Set r3 = r0.A0A()
            if (r12 == 0) goto L_0x00f4
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.ArrayList r2 = X.C22971Dz.A0A(r0, r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00e0
            r1.remove()
            goto L_0x00e0
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            X.00H r0 = r13.A09
            java.lang.Object r3 = r0.get()
            X.1OZ r3 = (X.AnonymousClass1OZ) r3
            java.lang.String r0 = r4.jabber_id
            X.2cl r1 = new X.2cl
            r1.<init>(r0, r2)
            r8 = 0
            r0 = 61
            r4 = 0
            android.os.Message r2 = android.os.Message.obtain(r4, r8, r0, r8, r1)
            X.C18070vi.A0d(r2, r8)
            r6 = 0
            r5 = r4
            X.AnonymousClass1OZ.A02(r2, r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31361fR.A01():void");
    }

    public void A00() {
        Log.i("ChangeNumberManager/deleteChangeNumberContacts");
        new File(this.A00.A00.getFilesDir(), "change_number_contacts.json").delete();
    }

    public boolean A02() {
        if (this.A07.A07() != null) {
            return true;
        }
        return false;
    }

    public C31361fR(AnonymousClass11S r2, AnonymousClass118 r3, AnonymousClass1SG r4, AnonymousClass122 r5, C24751Ln r6, AnonymousClass1RL r7, AnonymousClass1PQ r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        Boolean bool = C17960vV.A01;
        this.A00 = r3;
        this.A06 = r9;
        this.A07 = r2;
        this.A09 = r10;
        this.A08 = r11;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = r8;
        this.A04 = r7;
        this.A01 = r4;
    }
}
