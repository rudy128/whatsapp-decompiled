package X;

/* renamed from: X.6wI  reason: invalid class name and case insensitive filesystem */
public final class C137956wI {
    public AnonymousClass1KB A00;
    public AnonymousClass00H A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.87L] */
    public static final void A00(C137956wI r15, AnonymousClass86X r16, AnonymousClass86X r17, Integer num, Object obj, String str, String str2, String str3, String str4) {
        C1418477e r2;
        C1418477e r6;
        C1418477e r7;
        C1418477e r8;
        C137956wI r11 = r15;
        AnonymousClass00H r0 = r15.A01;
        if (r0 != null) {
            C131816li r3 = (C131816li) r0.get();
            String str5 = str;
            if (str == null) {
                r2 = null;
            } else {
                r2 = new C1418477e(new Object(), str5, "WaLinkedNativeAuthBlob");
            }
            String str6 = str2;
            if (str2 == null) {
                r6 = null;
            } else {
                r6 = new C1418477e(new Object(), str6, "WaLinkedWebAuthToken");
            }
            String str7 = str3;
            if (str3 == null) {
                r7 = null;
            } else {
                r7 = new C1418477e(new Object(), str7, "WaLinkedWebAuthUri");
            }
            String str8 = str4;
            if (str4 == null) {
                r8 = null;
            } else {
                r8 = new C1418477e(new Object(), str8, "WaEntId");
            }
            C144127Gc r10 = new C144127Gc(r11, r16, r17, obj, 1);
            C34991lS A0f = C108945cZ.A0f(r3.A00);
            C35021lW r32 = C35011lV.A00;
            Object[] objArr = new Object[7];
            AnonymousClass3MY.A1V((Object) null, num, objArr);
            objArr[2] = null;
            objArr[3] = r2;
            C72453Mb.A1T(r6, r7, objArr);
            A0f.A04(new AnonymousClass7GS(r10, 4), r32, AnonymousClass705.A00(), new C53932dK(2, C18070vi.A0O(r8, objArr, 6)));
            return;
        }
        C18070vi.A11("accountLinkingCustomActionsHelperLazy");
        throw null;
    }
}
