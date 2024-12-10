package X;

import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import java.lang.ref.WeakReference;

/* renamed from: X.6Ld  reason: invalid class name and case insensitive filesystem */
public final class C121696Ld extends A34 {
    public final Integer A00;
    public final String A01;
    public final /* synthetic */ PrivacyDisclosureContainerViewModel A02;

    public C121696Ld(PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel, Integer num, String str) {
        this.A02 = privacyDisclosureContainerViewModel;
        this.A00 = num;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r4 != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r1 < 400) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r14) {
        /*
            r13 = this;
            java.lang.Integer r4 = r13.A00
            r3 = 0
            if (r4 == 0) goto L_0x0017
            int r5 = r4.intValue()
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r13.A02     // Catch:{ Exception -> 0x009c }
            X.1iv r0 = r6.A04     // Catch:{ Exception -> 0x009c }
            X.1ir r0 = r0.A02     // Catch:{ Exception -> 0x009c }
            int r1 = r0.A02(r5)     // Catch:{ Exception -> 0x009c }
            r0 = 1
            if (r1 < r0) goto L_0x00b5
            goto L_0x0089
        L_0x0017:
            java.lang.String r10 = r13.A01
            if (r10 == 0) goto L_0x00fc
            int r0 = r10.length()
            if (r0 == 0) goto L_0x00fc
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r13.A02
            X.1iv r0 = r6.A04
            X.C33501iv.A00(r0)
            X.1ir r0 = r0.A02
            X.C33461ir.A01(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            java.util.Iterator r12 = X.C17890vO.A0i(r0)
            r4 = -2
            r9 = r3
            r8 = r3
        L_0x0037:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0076
            java.util.Map$Entry r11 = X.AnonymousClass000.A16(r12)
            java.lang.Object r7 = r11.getValue()
            X.C18070vi.A0X(r7)
            X.1tG r7 = (X.C39551tG) r7
            java.lang.String r2 = r7.A07
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "surf="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r10, r1)
            r0 = 0
            int r0 = X.AnonymousClass1YF.A0F(r2, r1, r0, r0)
            if (r0 <= 0) goto L_0x0037
            int r1 = r7.A01
            java.util.List r0 = X.C39751ta.A02
            boolean r0 = X.AnonymousClass3Ma.A1b(r0, r1)
            if (r0 != 0) goto L_0x0037
            long r1 = r7.A05
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            java.lang.Object r9 = r11.getKey()
            java.lang.String r8 = r7.A06
            long r4 = r7.A05
            goto L_0x0037
        L_0x0076:
            if (r9 == 0) goto L_0x00fc
            if (r8 == 0) goto L_0x00fc
            android.util.Pair r0 = X.C108945cZ.A0N(r9, r8)
            java.lang.Object r4 = r0.first
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            if (r4 == 0) goto L_0x00fc
            goto L_0x0093
        L_0x0089:
            r0 = 400(0x190, float:5.6E-43)
            if (r1 >= r0) goto L_0x00b5
        L_0x008d:
            X.1iv r0 = r6.A04
            java.lang.String r2 = r0.A01(r5)
        L_0x0093:
            if (r2 == 0) goto L_0x00fc
            int r5 = r4.intValue()
            java.lang.String r4 = "PrivacyDisclosureContainerViewModel: loadAndParseDisclosure: id="
            goto L_0x00c4
        L_0x009c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PrivacyDisclosureContainerViewModel: try to access to disclosureId="
            r1.append(r0)
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = X.C17890vO.A0V(r2, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00b5:
            com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel r6 = r13.A02
            X.1DT r2 = r6.A03
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.6s9 r0 = new X.6s9
            r0.<init>(r3, r1, r3)
            r2.A0E(r0)
            goto L_0x008d
        L_0x00c4:
            X.00H r0 = r6.A06     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            java.lang.Object r1 = r0.get()     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            X.6yu r1 = (X.C139476yu) r1     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            org.json.JSONObject r0 = X.C17880vN.A16(r2)     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            X.6rI r1 = r1.A00(r0, r5)     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            X.6s9 r6 = new X.6s9     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            r6.<init>(r3, r0, r1)     // Catch:{ 1tZ -> 0x00dc, JSONException -> 0x00e7 }
            return r6
        L_0x00dc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            r1.append(r5)
            java.lang.String r0 = ", PrivacyDisclosureDataException"
            goto L_0x00f1
        L_0x00e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)
            r1.append(r5)
            java.lang.String r0 = ", JSONException"
        L_0x00f1:
            X.C108985cd.A1M(r0, r1, r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            X.6s9 r6 = new X.6s9
            r6.<init>(r2, r0, r3)
            return r6
        L_0x00fc:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.6s9 r6 = new X.6s9
            r6.<init>(r3, r0, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121696Ld.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C160848Ae r0;
        C135406s9 r3 = (C135406s9) obj;
        C18070vi.A0d(r3, 0);
        this.A02.A03.A0F(r3);
        if (r3.A00 == AnonymousClass00R.A00 && r3.A01 == null) {
            WeakReference weakReference = AnonymousClass71X.A03;
            if (!(weakReference == null || (r0 = (C160848Ae) weakReference.get()) == null)) {
                r0.BzG();
            }
            AnonymousClass71X.A01 = null;
            AnonymousClass71X.A03 = null;
        }
    }
}
