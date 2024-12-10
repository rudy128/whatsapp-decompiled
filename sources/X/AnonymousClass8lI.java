package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.8lI  reason: invalid class name */
public abstract class AnonymousClass8lI extends C1188965r {
    public C23581Gv A00;
    public AnonymousClass1E7 A01;
    public C1776199s A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final C24671Lf A05;
    public final C37451pZ A06;
    public final AnonymousClass12E A07;
    public final C18000vb A08;
    public final C18030ve A09;
    public final WDSProfilePhoto A0A;
    public final C133196oK A0B;

    public void A0D() {
        C24671Lf r1 = this.A05;
        C23581Gv r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("contactObserver");
            throw null;
        } else {
            r1.unregisterObserver(r0);
        }
    }

    public void A0I(C1776199s r14, List list) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        int i;
        this.A02 = r14;
        C22931Dv r1 = AnonymousClass1BI.A00;
        C195819tx r2 = r14.A02;
        this.A01 = new AnonymousClass1E7(r1.A02(r2.A07));
        TextEmojiLabel textEmojiLabel = this.A03;
        String str = r2.A0A;
        List<C193639qQ> list2 = r2.A0B;
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(str);
        for (C193639qQ r0 : list2) {
            int i2 = r0.A01;
            if (i2 >= 0 && (i = r0.A00) < str.length()) {
                A092.setSpan(new ForegroundColorSpan(C19740yt.A00(textEmojiLabel.getContext(), 2131102246)), i2, i + 1, 33);
            }
        }
        textEmojiLabel.setText(A092);
        Integer num = r2.A04;
        if (num == null || num.intValue() != 2) {
            textEmojiLabel.A0N();
        } else {
            textEmojiLabel.A0O(C196929vs.A01(this.A09), 2131168352);
        }
        String str2 = r2.A09;
        if (str2 == null || str2.length() == 0) {
            this.A04.setVisibility(8);
        } else {
            TextEmojiLabel textEmojiLabel2 = this.A04;
            textEmojiLabel2.setVisibility(0);
            C17960vV.A07(str2);
            if (AnonymousClass1YF.A0Y(str2, "{distance}", false)) {
                C20079A6f a6f = r14.A01;
                if (!(!a6f.A07() || (d = r2.A00) == null || (d2 = r2.A01) == null)) {
                    double doubleValue = d.doubleValue();
                    if (!Double.isNaN(doubleValue)) {
                        double doubleValue2 = d2.doubleValue();
                        if (!(Double.isNaN(doubleValue2) || doubleValue == 0.0d || doubleValue2 == 0.0d || (d3 = a6f.A03) == null || (d4 = a6f.A04) == null)) {
                            C17960vV.A07(d3);
                            double doubleValue3 = d3.doubleValue();
                            C17960vV.A07(d4);
                            LatLng A093 = AnonymousClass8BV.A09(d4, doubleValue3);
                            C17960vV.A07(d);
                            double doubleValue4 = d.doubleValue();
                            C17960vV.A07(d2);
                            String A002 = C181149Pi.A00(C108945cZ.A0D(this), this.A08.A0N(), AnonymousClass8BX.A0D(A093, "origin").distanceTo(AnonymousClass8BX.A0D(AnonymousClass8BV.A09(d2, doubleValue4), "destination")));
                            C18070vi.A0X(A002);
                            str2 = AnonymousClass1YE.A07(str2, "{distance}", A002, false);
                        }
                    }
                }
            }
            textEmojiLabel2.setText(str2);
        }
        C89994dM.A00(this.A0H, this, r14, 9);
        C133196oK r4 = this.A0B;
        AnonymousClass1E7 r3 = this.A01;
        if (r3 != null) {
            WDSProfilePhoto wDSProfilePhoto = this.A0A;
            C18070vi.A0d(wDSProfilePhoto, 1);
            AnonymousClass7E2 r12 = new AnonymousClass7E2(wDSProfilePhoto, r4, r3);
            this.A00 = r12;
            this.A05.registerObserver(r12);
            C37451pZ r13 = this.A06;
            AnonymousClass1E7 r02 = this.A01;
            if (r02 != null) {
                r13.A07(wDSProfilePhoto, r02);
                return;
            }
        }
        C18070vi.A11("waContact");
        throw null;
    }

    public AnonymousClass8lI(View view, C133196oK r3, C24671Lf r4, C37451pZ r5, AnonymousClass12E r6, C18000vb r7, C18030ve r8) {
        super(view);
        this.A09 = r8;
        this.A08 = r7;
        this.A05 = r4;
        this.A07 = r6;
        this.A06 = r5;
        this.A0B = r3;
        this.A03 = C72453Mb.A0c(view, 2131428527);
        this.A0A = (WDSProfilePhoto) C18070vi.A05(view, 2131434160);
        this.A04 = C72453Mb.A0c(view, 2131428571);
    }
}
