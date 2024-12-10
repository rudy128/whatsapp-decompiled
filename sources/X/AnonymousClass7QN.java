package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.7QN  reason: invalid class name */
public class AnonymousClass7QN implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    public AnonymousClass7QN(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A07 = str;
        this.A05 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
        this.A06 = obj6;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) ((DialogFragment) this.A02);
                D8B d8b = bkCdsBottomSheetFragment.A03;
                C18070vi.A0z(d8b, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
                String str = this.A07;
                bkCdsBottomSheetFragment.A2E(A8X.A01((Context) this.A03, d8b, (BDM) this.A05, (C26235CvV) this.A04, (C22358B4m) this.A01, str), (AnonymousClass8d6) this.A06);
                return;
            case 1:
                View view = (View) this.A04;
                C130226j5 r5 = (C130226j5) this.A06;
                String str2 = this.A07;
                C32021gV r1 = ((AnonymousClass6L5) this.A01).A04;
                BitmapFactory.Options options = C32021gV.A0E;
                r1.A04.A01(view, (AnonymousClass206) this.A02, (C693536w) this.A03, r5, (AnonymousClass3M2) this.A05, str2, false);
                return;
            case 2:
                AnonymousClass732 r7 = new AnonymousClass732(C35081lc.A0D, 0L, "", "", (String) null, 0, 0);
                Integer num = (Integer) this.A04;
                String str3 = this.A07;
                PublicKey publicKey = (PublicKey) this.A05;
                ((C35081lc) this.A06).CBb(r7, (C1606789m) this.A01, (AnonymousClass705) this.A03, num, str3, publicKey, (X509Certificate) this.A02);
                return;
            case 3:
                String str4 = this.A07;
                C132926ns r2 = (C132926ns) this.A03;
                C147137Ry r4 = (C147137Ry) this.A04;
                C138356ww.A00((AnonymousClass705) this.A05, r2, (C138356ww) this.A01, r4, str4, (List) this.A02, (List) this.A06);
                return;
            default:
                AnonymousClass77S r22 = (AnonymousClass77S) this.A02;
                C132736nT r3 = (C132736nT) this.A04;
                C147147Rz r52 = (C147147Rz) this.A05;
                AnonymousClass705 r12 = (AnonymousClass705) this.A06;
                C18070vi.A0d(r22, 1);
                C138396x0.A00(r12, r22, r3, (C138396x0) this.A01, r52, this.A07, (List) this.A03);
                return;
        }
    }
}
