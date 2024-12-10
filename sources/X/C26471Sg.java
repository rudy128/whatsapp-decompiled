package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Sg  reason: invalid class name and case insensitive filesystem */
public class C26471Sg extends C26461Sf {
    public final C26421Sb A00;

    public C26471Sg(C26421Sb r4, AnonymousClass10I r5) {
        super(new C18150vq((Object) null, new C70943Dc(r5, 14)));
        this.A00 = r4;
    }

    public C167228ff A0A(AnonymousClass85B r3, C62492rU r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediauploadqueue/enqueue ");
        sb.append(r4);
        Log.i(sb.toString());
        return (C167228ff) A04(r3, r4);
    }

    /* renamed from: A0B */
    public boolean A08(AnonymousClass85B r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("mediauploadqueue/cancel ");
        sb.append(r3);
        Log.i(sb.toString());
        return super.A08(r3);
    }
}
