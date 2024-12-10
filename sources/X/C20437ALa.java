package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.ALa  reason: case insensitive filesystem */
public class C20437ALa implements C28582E8t {
    public View A00;
    public final C22654BId A01;
    public final C183059Wt A02;
    public final C18030ve A03;
    public final C18140vp A04;

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        C18140vp r1 = this.A04;
        if (r1.get() == null) {
            return false;
        }
        r1.get();
        return false;
    }

    public C20437ALa(C22654BId bId, C183059Wt r2, C18030ve r3, C18140vp r4) {
        this.A03 = r3;
        this.A01 = bId;
        this.A04 = r4;
        this.A02 = r2;
    }

    public void CQJ() {
        int i;
        CLk();
        View view = this.A00;
        if (view == null) {
            boolean A05 = C18020vd.A05(C18040vf.A01, this.A03, 5332);
            C22654BId bId = this.A01;
            LayoutInflater A0D = AnonymousClass3MZ.A0D(bId);
            if (A05) {
                i = 2131625019;
            } else {
                i = 2131625018;
            }
            view = A0D.inflate(i, bId, false);
            this.A00 = view;
        }
        C22654BId bId2 = this.A01;
        Context context = bId2.getContext();
        AnonymousClass78Q r5 = new AnonymousClass78Q((Object) this, (Object) context, 22);
        AFU afu = new AFU((Object) this, 22);
        if (view instanceof WDSBanner) {
            WDSBanner wDSBanner = (WDSBanner) view;
            AnonymousClass4XT r2 = new AnonymousClass4XT();
            r2.A02 = AnonymousClass4A9.A00;
            r2.A01 = 2131896217;
            r2.A03 = AnonymousClass4W6.A00(bId2.getContext(), 2131896218);
            r2.A05 = true;
            wDSBanner.setState(r2.A01());
            if (!C22891Dp.A02) {
                wDSBanner.A08();
            } else {
                wDSBanner.A07();
            }
            wDSBanner.setOnClickListener(r5);
            wDSBanner.setOnDismissListener((View.OnClickListener) afu);
            return;
        }
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(context.getString(2131896216));
        SpannableString A092 = AnonymousClass8BU.A09(context, 2131899101);
        int i2 = 2130971306;
        if (C18020vd.A05(C18040vf.A01, this.A03, 5332)) {
            i2 = 2130968627;
        }
        A092.setSpan(new ForegroundColorSpan(AnonymousClass3Ma.A00(context, i2, 2131102021)), 0, A092.length(), 33);
        A09.append(" ").append(A092);
        AnonymousClass3MX.A0V(view, 2131428063).A0R(A09);
        bId2.setBackgroundResource(AnonymousClass1YL.A00(context, 2130970634, 2131102020));
        bId2.setOnClickListener(r5);
        AnonymousClass8BS.A06(view).setOnClickListener(afu);
        view.setVisibility(0);
    }
}
