package X;

import android.content.ContentValues;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

/* renamed from: X.Ak7  reason: case insensitive filesystem */
public class C21440Ak7 implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    public C21440Ak7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A08 = z;
        this.A06 = obj6;
        this.A07 = obj7;
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [X.9N0, java.lang.Object] */
    public void run() {
        C28791au A052;
        A4D a4d;
        C187569g1 r5;
        switch (this.A00) {
            case 0:
                if (!this.A08) {
                    r5 = null;
                    a4d = (A4D) this.A02;
                    if (!a4d.A02) {
                        C20375AIg.A02((C20375AIg) this.A01, (BA6) this.A04, (C20282AEq) this.A06, a4d, AnonymousClass000.A0n("Non prefetch request should have effect available."));
                        return;
                    }
                } else {
                    C188409hN r1 = (C188409hN) this.A05;
                    C199099zQ r7 = r1.A00;
                    AnonymousClass9N0 r4 = r1.A01;
                    AnonymousClass9N0 r42 = r4;
                    if (r4 == null) {
                        HashMap A11 = C17880vN.A11();
                        ? obj = new Object();
                        obj.A00 = A11;
                        r42 = obj;
                    }
                    C187119fI r3 = r1.A02;
                    a4d = (A4D) this.A02;
                    String str = a4d.A01;
                    String str2 = a4d.A00;
                    r5 = new C187569g1(r7, r42);
                    if (r3 != null) {
                        r5.A05.add(r3);
                    }
                    r5.A01 = str;
                    r5.A02 = str2;
                }
                C20375AIg aIg = (C20375AIg) this.A01;
                aIg.A06.A03(((C188409hN) this.A05).A07, (AnonymousClass9LV) null, a4d, true);
                C167148fU r43 = aIg.A05;
                if (!C72453Mb.A1a(r43.A00) && !a4d.A02) {
                    String str3 = a4d.A00;
                    r43.A05(r43.A00(16321564, str3.hashCode()), "effect_fetched", str3);
                }
                ((BA6) this.A04).onSuccess(r5);
                return;
            case 1:
                C133496or r10 = (C133496or) this.A01;
                View view = (View) this.A02;
                View view2 = (View) this.A03;
                View view3 = (View) this.A04;
                C37301pI r6 = (C37301pI) this.A05;
                boolean z = this.A08;
                View view4 = (View) this.A06;
                Resources resources = (Resources) this.A07;
                C18070vi.A0d(r10, 0);
                AnonymousClass8BX.A1J(view, view2, view3, 1);
                C18070vi.A0d(r6, 4);
                C18070vi.A0l(view4, resources);
                r10.A01(true);
                view.setVisibility(0);
                view2.setVisibility(4);
                view3.setVisibility(0);
                r6.A02(false, C72453Mb.A03(z ? 1 : 0));
                C23520Bik A012 = C23520Bik.A01(view4, 2131893337, -1);
                BIE bie = A012.A0J;
                ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bie);
                int dimensionPixelSize = resources.getDimensionPixelSize(2131168774);
                A0P.setMargins(dimensionPixelSize, A0P.topMargin, dimensionPixelSize, dimensionPixelSize);
                bie.setLayoutParams(A0P);
                A012.A08();
                return;
            case 2:
                C85694Oj r12 = (C85694Oj) this.A01;
                View view5 = (View) this.A02;
                C18030ve r32 = (C18030ve) this.A03;
                C143887Fe r72 = (C143887Fe) this.A04;
                AnonymousClass206 r52 = (AnonymousClass206) this.A05;
                boolean z2 = this.A08;
                Object obj2 = this.A06;
                Object obj3 = this.A07;
                C86424Ro r0 = (C86424Ro) view5.getTag();
                try {
                    r0.A00.A0I(r32);
                    AnonymousClass206 r33 = r0.A01;
                    if (C60532oB.A00(r33) != null) {
                        C20941Abv A002 = C60532oB.A00(r33);
                        byte[] bArr = r72.A0K;
                        if (bArr == null) {
                            bArr = r72.A0J;
                        }
                        A002.A01 = bArr;
                    }
                    if (r33.A0v.A01.equals(r52.A0v.A01)) {
                        r12.A00.A0J(new C21437Ak4(view5, r72, obj2, obj3, 9, z2));
                    }
                    byte[] bArr2 = r72.A0K;
                    if (!(bArr2 == null && (bArr2 = r72.A0J) == null)) {
                        C53312cK r44 = r12.A02;
                        long j = r33.A0x;
                        A052 = r44.A00.A05();
                        ContentValues A082 = C17880vN.A08();
                        A082.put("full_thumbnail", bArr2);
                        if (((C28801av) A052).A02.A02(A082, "message_external_ad_content", "message_row_id=?", "ExternalAdContentInfoStore/updateFullThumbnail", C17900vP.A0t(j)) == 0) {
                            Log.e("ExternalAdContentInfoStore/updateFullThumbnail/full thumbnail wasn't updated");
                        }
                        A052.close();
                    }
                } catch (IOException | URISyntaxException e) {
                    Log.w("ConversationPageInfoLoader/load/failed to load thumb", e);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    break;
                }
                r12.A05.remove(r0.A01.A0v.A01);
                return;
            default:
                View view6 = (View) this.A04;
                C130226j5 r53 = (C130226j5) this.A06;
                Object obj4 = this.A07;
                boolean z3 = this.A08;
                C32021gV r13 = ((AnonymousClass2P9) this.A01).A05;
                BitmapFactory.Options options = C32021gV.A0E;
                r13.A04.A01(view6, (AnonymousClass206) this.A02, (C693536w) this.A03, r53, (AnonymousClass3M2) this.A05, obj4, z3);
                return;
        }
        throw th;
    }

    public C21440Ak7(C20375AIg aIg, C188409hN r3, C180189Lm r4, BA6 ba6, AnonymousClass9OY r6, C20282AEq aEq, A4D a4d, boolean z) {
        this.A00 = 0;
        this.A01 = aIg;
        this.A08 = z;
        this.A03 = r6;
        this.A05 = r3;
        this.A02 = a4d;
        this.A06 = aEq;
        this.A04 = ba6;
        this.A07 = r4;
    }
}
