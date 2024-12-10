package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.1pZ  reason: invalid class name and case insensitive filesystem */
public class C37451pZ {
    public C43051zA A00;
    public final float A01;
    public final int A02;
    public final C37461pa A03 = new C37461pa();
    public final String A04;
    public final boolean A05;
    public final /* synthetic */ C27201Vd A06;

    public void A04(ImageView imageView, AnonymousClass25N r12) {
        AnonymousClass25N r6 = r12;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r12.A06);
        String obj = Long.valueOf(r12.A04).toString();
        imageView.setTag(obj);
        if (r12.A00 != null) {
            C27201Vd r0 = this.A06;
            new C42981z3(r0.A02, r0.A0C, r0.A0E).CMZ(r12.A00, imageView, true);
            return;
        }
        AnonymousClass1E7 r02 = r12.A01;
        if (r02 != null) {
            A07(imageView, r02);
            return;
        }
        C27201Vd r03 = this.A06;
        A01(imageView2, new C42981z3(r03.A02, r03.A0C, r03.A0E), r6, obj, this.A01, this.A02);
    }

    public void A08(ImageView imageView, AnonymousClass1E7 r8, float f, int i) {
        A09(imageView, r8, f, i, true);
    }

    public void A0A(ImageView imageView, AnonymousClass1E7 r3, int i) {
        A0B(imageView, r3, i, true);
    }

    public void A0D(ImageView imageView, AnonymousClass73C r11) {
        C27201Vd r0 = this.A06;
        ImageView imageView2 = imageView;
        AnonymousClass73C r6 = r11;
        A06(imageView2, new C42981z3(r0.A02, r0.A0C, r0.A0E), r6, this.A01, this.A02);
    }

    public C37451pZ(C27201Vd r2, String str, float f, int i, boolean z) {
        this.A06 = r2;
        this.A02 = i;
        this.A01 = f;
        this.A04 = str;
        this.A05 = z;
    }

    private void A00(ImageView imageView, C42971z2 r14, AnonymousClass1E7 r15, float f, int i, boolean z) {
        Bitmap A012;
        String A0I;
        int i2 = i;
        if (i < 0 || i2 > 10000) {
            Log.e("contactPhotos/attempting to display invalid size, did you pass a resource ID?");
        }
        ImageView imageView2 = imageView;
        AnonymousClass1E7 r8 = r15;
        if (z) {
            C27201Vd r2 = this.A06;
            if (r2.A01.A0O(r15.A0J)) {
                A0I = imageView.getContext().getString(2131898595);
            } else {
                A0I = r2.A04.A0I(r15);
            }
            imageView.setContentDescription(A0I);
        }
        float f2 = f;
        String A08 = r15.A08(f2, i2);
        boolean equals = A08.equals(imageView.getTag());
        imageView.setTag(A08);
        C27201Vd r4 = this.A06;
        Bitmap bitmap = (Bitmap) r4.A05.A02.A04().A0A(A08);
        C42971z2 r7 = r14;
        if (bitmap == null) {
            if (!equals || !r15.A0g) {
                if (!C18020vd.A05(C18040vf.A02, r4.A0D, 9156) || r15.A0g || (A012 = C27201Vd.A01(r4, r15)) == null) {
                    Bitmap A002 = r4.A07.A00(imageView.getContext(), r15, f2, i2);
                    if (A002 != null) {
                        r14.CMZ(A002, imageView, true);
                    } else {
                        r14.CN5(imageView);
                    }
                } else {
                    bitmap = C27201Vd.A00(A012, f2, i2, false);
                }
            }
            if (r15.A0g) {
                A01(imageView2, r7, r8, A08, f2, i2);
                return;
            }
            return;
        }
        r14.CMZ(bitmap, imageView, true);
    }

    private void A01(ImageView imageView, C42971z2 r30, Object obj, Object obj2, float f, int i) {
        ImageView imageView2 = imageView;
        A03(imageView2);
        C43041z9 r1 = new C43041z9(imageView2, r30, obj, obj2, f, i);
        C37461pa r13 = this.A03;
        Stack stack = r13.A00;
        synchronized (stack) {
            stack.add(0, r1);
            stack.notifyAll();
            C43051zA r12 = this.A00;
            if (r12 == null || (this.A05 && r12.A0D)) {
                String str = this.A04;
                C27201Vd r0 = this.A06;
                C18030ve r15 = r0.A0D;
                AnonymousClass11S r14 = r0.A01;
                AnonymousClass118 r10 = r0.A09;
                C18000vb r9 = r0.A0A;
                AnonymousClass1KB r8 = r0.A00;
                C27171Va r7 = r0.A07;
                AnonymousClass1M9 r6 = r0.A03;
                C27191Vc r5 = r0.A06;
                AnonymousClass11C r4 = r0.A08;
                boolean z = this.A05;
                AnonymousClass00H r2 = r0.A0G;
                String str2 = str;
                AnonymousClass00H r24 = r2;
                C18030ve r23 = r15;
                C18000vb r22 = r9;
                AnonymousClass118 r21 = r10;
                AnonymousClass11C r20 = r4;
                C27171Va r19 = r7;
                C27191Vc r18 = r5;
                C37461pa r17 = r13;
                AnonymousClass1M9 r16 = r6;
                AnonymousClass11S r152 = r14;
                AnonymousClass1KB r142 = r8;
                C43051zA r132 = new C43051zA(r142, r152, r16, r17, r18, r19, r20, r21, r22, r23, r24, r0.A0F, str2, z);
                this.A00 = r132;
                r132.start();
            }
        }
    }

    public void A02() {
        C43051zA r1 = this.A00;
        if (r1 != null) {
            r1.A0D = true;
            r1.interrupt();
            this.A00 = null;
        }
    }

    public void A03(ImageView imageView) {
        Stack stack = this.A03.A00;
        synchronized (stack) {
            int i = 0;
            while (i < stack.size()) {
                if (((C43041z9) stack.get(i)).A02 == imageView) {
                    stack.remove(i);
                } else {
                    i++;
                }
            }
        }
    }

    public void A05(ImageView imageView, C42971z2 r11, AnonymousClass1E7 r12, boolean z) {
        AnonymousClass1E7 r5 = r12;
        float f = this.A01;
        if (this.A06.A0B.A06((GroupJid) r12.A06(GroupJid.class)) == 1) {
            f = -2.14748365E9f;
        }
        A00(imageView, r11, r5, f, this.A02, z);
    }

    public void A07(ImageView imageView, AnonymousClass1E7 r3) {
        if (imageView != null) {
            A0C(imageView, r3, true);
        }
    }

    public void A09(ImageView imageView, AnonymousClass1E7 r16, float f, int i, boolean z) {
        C65482wZ r1;
        float f2 = f;
        if (f == -2.14748365E9f) {
            r1 = new C65482wZ(0);
        } else {
            r1 = null;
        }
        C27201Vd r0 = this.A06;
        AnonymousClass1E7 r3 = r16;
        A00(imageView, new C42981z3(r1, r0.A02, r3, r0.A0C, r0.A0E, (Integer) null), r3, f2, i, z);
    }

    public void A0B(ImageView imageView, AnonymousClass1E7 r10, int i, boolean z) {
        AnonymousClass1E7 r4 = r10;
        float f = this.A01;
        if (this.A06.A0B.A06((GroupJid) r10.A06(GroupJid.class)) == 1) {
            f = -2.14748365E9f;
        }
        A09(imageView, r4, f, i, z);
    }

    public void A0C(ImageView imageView, AnonymousClass1E7 r9, boolean z) {
        C27201Vd r0 = this.A06;
        AnonymousClass1E7 r3 = r9;
        A05(imageView, new C42981z3((C43011z6) null, r0.A02, r3, r0.A0C, r0.A0E, (Integer) null), r9, z);
    }

    public void A06(ImageView imageView, C42971z2 r13, AnonymousClass73C r14, float f, int i) {
        int i2;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r14.A02());
        ArrayList arrayList = new ArrayList();
        List<C129926ib> list = r14.A06;
        if (list != null) {
            for (C129926ib r0 : list) {
                UserJid userJid = r0.A01;
                if (userJid != null) {
                    arrayList.add(userJid);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            i2 = i;
            if (!it.hasNext()) {
                break;
            }
            AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
            if (C22971Dz.A0Y(r1)) {
                C27201Vd r3 = this.A06;
                AnonymousClass1E7 A0E = r3.A03.A0E(r1);
                if (A0E != null) {
                    A00(imageView2, new C42981z3(r3.A02, r3.A0C, r3.A0E), A0E, f, i2, true);
                    return;
                }
            }
        }
        byte[] bArr = r14.A0B;
        if (bArr == null || bArr.length <= 0) {
            r13.CN5(imageView);
        } else {
            r13.CMZ(AnonymousClass204.A0C(new AnonymousClass25O(i2, i2), bArr).A02, imageView, true);
        }
    }
}
