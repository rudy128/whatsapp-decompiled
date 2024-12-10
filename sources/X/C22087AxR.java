package X;

/* renamed from: X.AxR  reason: case insensitive filesystem */
public final class C22087AxR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BAU $listener;
    public final /* synthetic */ AnonymousClass1D6 $phoneNumberPair;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ C193599qM $userEntityForNativeAuth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22087AxR(BAU bau, C193599qM r3, String str, AnonymousClass1D6 r5) {
        super(0);
        this.$listener = bau;
        this.$userEntityForNativeAuth = r3;
        this.$purpose = str;
        this.$phoneNumberPair = r5;
    }

    public static C187899gY A00(C22087AxR axR) {
        return (C187899gY) axR.$userEntityForNativeAuth.A01.A00(axR.$purpose);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        BAU bau = this.$listener;
        C187899gY A00 = A00(this);
        String str6 = null;
        if (A00 != null) {
            str = A00.A04;
        } else {
            str = null;
        }
        C187899gY A002 = A00(this);
        if (A002 != null) {
            str2 = A002.A02;
        } else {
            str2 = null;
        }
        C187899gY A003 = A00(this);
        if (A003 != null) {
            str3 = A003.A01;
        } else {
            str3 = null;
        }
        AnonymousClass1D6 r10 = this.$phoneNumberPair;
        C187899gY A004 = A00(this);
        if (A004 != null) {
            str4 = A004.A05;
        } else {
            str4 = null;
        }
        C187899gY A005 = A00(this);
        if (A005 != null) {
            num = Integer.valueOf(A005.A00.A00);
        } else {
            num = null;
        }
        C193599qM r0 = this.$userEntityForNativeAuth;
        int i = r0.A00;
        C187899gY r02 = (C187899gY) r0.A01.A00(this.$purpose);
        if (r02 != null) {
            str5 = r02.A00.A01;
        } else {
            str5 = null;
        }
        C187899gY A006 = A00(this);
        if (A006 != null) {
            str6 = A006.A03;
        }
        bau.CAY(num, str, str2, str3, str4, str5, str6, r10, i);
        return C27621Wu.A00;
    }
}
