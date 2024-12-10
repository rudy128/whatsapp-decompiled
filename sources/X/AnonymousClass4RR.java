package X;

import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.4RR  reason: invalid class name */
public class AnonymousClass4RR {
    public C827249m A00;
    public final C002100z A01 = new C002100z(32);
    public final AnonymousClass1KB A02;
    public final AnonymousClass4LG A03 = new AnonymousClass4LG();
    public final AnonymousClass11C A04;
    public final C19830z4 A05;
    public final C18030ve A06;
    public final C53542ch A07;
    public final C18010vc A08;
    public final C36401np A09;

    public AnonymousClass4RR(AnonymousClass1KB r3, AnonymousClass11C r4, C19830z4 r5, C18030ve r6, C53542ch r7, C18010vc r8, C36401np r9) {
        this.A02 = r3;
        this.A09 = r9;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = r6;
    }

    public void A00(TextView textView, AnonymousClass5ZA r7, AnonymousClass206 r8, CharSequence charSequence) {
        textView.setTag(r8);
        CharSequence charSequence2 = (CharSequence) this.A01.A04(charSequence.toString());
        if (charSequence2 != null) {
            r7.CF8(AnonymousClass3MW.A09(charSequence2));
            return;
        }
        AnonymousClass4LG r4 = this.A03;
        LinkedBlockingDeque linkedBlockingDeque = r4.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            C85514Nr r1 = (C85514Nr) it.next();
            if (r1.A00 == textView) {
                linkedBlockingDeque.remove(r1);
            }
        }
        linkedBlockingDeque.add(new C85514Nr(textView, r7, r8, charSequence));
        if (this.A00 == null) {
            C827249m r0 = new C827249m(r4, this, this.A05.A0l());
            this.A00 = r0;
            r0.start();
        }
    }
}
