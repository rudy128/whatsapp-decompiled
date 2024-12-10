package X;

/* renamed from: X.9fj  reason: invalid class name and case insensitive filesystem */
public final class C187389fj {
    public String A00;
    public final C179349Hp A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r1.equals("close") != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r16 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        r1 = X.AnonymousClass00R.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        if (r1.equals("back") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0108, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C187389fj(X.C192819p2 r13, java.lang.String r14, java.util.Map r15, boolean r16) {
        /*
            r12 = this;
            r9 = 1
            r12.<init>()
            r5 = 0
            if (r15 == 0) goto L_0x012e
            java.lang.String r0 = "style"
            java.lang.Object r1 = r15.get(r0)
        L_0x000d:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x012b
            java.util.Map r1 = (java.util.Map) r1
        L_0x0013:
            java.lang.String r6 = "on_back_params"
            java.lang.String r4 = "modal_type"
            java.lang.String r3 = "on_back"
            java.lang.String r2 = "button_style"
            java.lang.String r7 = "type"
            if (r1 == 0) goto L_0x010f
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
            X.AnonymousClass8BS.A1E(r7, r1, r8)
            X.AnonymousClass8BS.A1E(r4, r1, r8)
            java.lang.String r0 = "leading_button_config"
            java.lang.Object r11 = r1.get(r0)
            boolean r0 = r11 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x010c
            r0 = r11
            java.util.Map r0 = (java.util.Map) r0
        L_0x0037:
            if (r11 == 0) goto L_0x0108
            if (r0 != 0) goto L_0x0051
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FcsStateMachine/extractPresentationStyle/unexpected format for presentation.style.leading_button_config: "
            X.C17900vP.A0X(r11, r0, r10)
        L_0x0044:
            r0 = 2
            X.1D6[] r0 = new X.AnonymousClass1D6[r0]
            X.C72463Mc.A1H(r2, r1, r0)
            X.AnonymousClass1D6.A03(r3, r1, r0, r9)
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A0B(r0)
        L_0x0051:
            r8.putAll(r0)
        L_0x0054:
            if (r16 == 0) goto L_0x00f4
            X.9Hp r9 = X.C179349Hp.MODAL
        L_0x0058:
            r12.A01 = r9
            X.9Hp r7 = X.C179349Hp.MODAL
            if (r9 != r7) goto L_0x00f1
            if (r16 == 0) goto L_0x00dd
            if (r13 == 0) goto L_0x00da
            X.9tg r0 = r13.A03
            java.lang.Integer r0 = r0.A00
        L_0x0066:
            r12.A03 = r0
            java.lang.String r1 = X.C108945cZ.A1G(r2, r8)
            if (r1 == 0) goto L_0x0089
            int r2 = r1.hashCode()
            r0 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r2 == r0) goto L_0x00ce
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r2 == r0) goto L_0x00c3
            r0 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r2 != r0) goto L_0x0089
            java.lang.String r0 = "close"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008d
        L_0x0089:
            if (r9 != r7) goto L_0x00d7
            if (r16 != 0) goto L_0x00d7
        L_0x008d:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x008f:
            r12.A02 = r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00a6
            java.lang.String r1 = X.C108945cZ.A1G(r3, r8)
            if (r1 == 0) goto L_0x00a6
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C108975cc.A14(r0, r14)
            java.lang.String r5 = X.AnonymousClass000.A0y(r1, r0)
        L_0x00a6:
            r12.A04 = r5
            java.lang.Object r1 = r8.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r1 instanceof X.C18450wR
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r1 instanceof X.C41611wl
            if (r0 == 0) goto L_0x00c2
        L_0x00b8:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x00c2
            java.lang.String r0 = X.AnonymousClass8BU.A0s(r1)
            r12.A00 = r0
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x008f
        L_0x00ce:
            java.lang.String r0 = "back"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d7
            goto L_0x0089
        L_0x00d7:
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x008f
        L_0x00da:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0066
        L_0x00dd:
            java.lang.Object r1 = r8.get(r4)
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00ed
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0066
        L_0x00ed:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0066
        L_0x00f1:
            r0 = r5
            goto L_0x0066
        L_0x00f4:
            java.lang.Object r1 = r8.get(r7)
            java.lang.String r0 = "modal"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0104
            X.9Hp r9 = X.C179349Hp.MODAL
            goto L_0x0058
        L_0x0104:
            X.9Hp r9 = X.C179349Hp.PUSH
            goto L_0x0058
        L_0x0108:
            if (r0 != 0) goto L_0x0051
            goto L_0x0044
        L_0x010c:
            r0 = r1
            goto L_0x0037
        L_0x010f:
            r0 = 5
            X.1D6[] r1 = new X.AnonymousClass1D6[r0]
            r0 = 0
            X.AnonymousClass1D6.A03(r7, r5, r1, r0)
            X.AnonymousClass1D6.A03(r2, r5, r1, r9)
            r0 = 2
            X.AnonymousClass1D6.A03(r3, r5, r1, r0)
            r0 = 3
            X.AnonymousClass1D6.A03(r4, r5, r1, r0)
            r0 = 4
            X.AnonymousClass1D6.A03(r6, r5, r1, r0)
            java.util.LinkedHashMap r8 = X.AnonymousClass1D7.A0B(r1)
            goto L_0x0054
        L_0x012b:
            r1 = r5
            goto L_0x0013
        L_0x012e:
            r1 = r5
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187389fj.<init>(X.9p2, java.lang.String, java.util.Map, boolean):void");
    }
}
