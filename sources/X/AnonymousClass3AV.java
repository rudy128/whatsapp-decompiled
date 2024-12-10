package X;

/* renamed from: X.3AV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3AV implements AnonymousClass1TI {
    public final /* synthetic */ C203711w A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void accept(Object obj) {
        C203711w r1 = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        if (str == null) {
            str = "user_initiated";
        }
        AnonymousClass1RK r4 = r1.A0a;
        C678130y r3 = new C678130y(r1, z);
        C17900vP.A0f("companion-device-manager/logoutDeviceInCompanionModeWithCallback: , removalReason ", str, AnonymousClass000.A10());
        AnonymousClass37F r12 = new AnonymousClass37F((C198589ya) null, r3, (AnonymousClass1OZ) r4.A07.A00.A00.A6N.get(), str);
        AnonymousClass11S r0 = r4.A09;
        r0.A0I();
        r12.A00(r0.A02);
    }

    public /* synthetic */ AnonymousClass3AV(C203711w r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }
}
