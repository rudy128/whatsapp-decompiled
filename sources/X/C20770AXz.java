package X;

import android.content.Context;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.AXz  reason: case insensitive filesystem */
public class C20770AXz implements BB7 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C20770AXz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A02 = obj;
        this.A03 = obj4;
    }

    public void Bss(A7B a7b) {
        switch (this.A00) {
            case 0:
                ((C190249kc) this.A03).A00(a7b);
                return;
            case 1:
                ((BDs) this.A02).BtH(a7b);
                return;
            default:
                ((PinBottomSheetDialogFragment) this.A04).A2M();
                ((A5V) this.A01).A03();
                return;
        }
    }

    public void C7R(String str) {
        String str2 = str;
        switch (this.A00) {
            case 0:
                C188549hb r5 = (C188549hb) this.A01;
                Object[] objArr = new Object[0];
                String str3 = str2;
                byte[] A002 = C198169xt.A00(AnonymousClass000.A0i(), str3, "RECOVERACCOUNT", (String) null, (byte[]) null, objArr, AnonymousClass11P.A00(r5.A09.A01));
                AZ2 az2 = ((C198959zC) this.A04).A00;
                C178759Ei r7 = new C178759Ei(az2.A05, az2.A03, AZ2.A00(az2, A002), Long.parseLong(az2.A04));
                Object obj = this.A03;
                C31061ex r8 = r5.A03;
                String A06 = r8.A06();
                AnonymousClass9F6 r6 = new AnonymousClass9F6(r7, A06, 12);
                r8.A0H(new C175488yn((Context) this.A02, r5.A02, r5.A00, obj, r5, r6, 2), (C29621ca) r6.A00, A06, 0);
                return;
            case 1:
                C198809yw r11 = (C198809yw) this.A01;
                Object[] objArr2 = new Object[0];
                C29621ca A012 = ((C198959zC) this.A04).A01(C198169xt.A00(AnonymousClass000.A0i(), str2, "AUTH", (String) null, (byte[]) null, objArr2, AnonymousClass11P.A00(r11.A0P.A01)));
                String A0e = AnonymousClass8BS.A0e(r11.A02, r11.A03);
                r11.A0R.CGN(new C21456AkN(r11, this.A02, A012, A0e, 36));
                return;
            default:
                ((A5V) this.A01).A06((PinBottomSheetDialogFragment) this.A04, ((C198959zC) this.A02).A01(C198169xt.A00(AnonymousClass000.A0i(), str2, "AUTH", (String) null, (byte[]) null, new Object[0], AnonymousClass11P.A00(((C198169xt) this.A03).A01))));
                return;
        }
    }
}
