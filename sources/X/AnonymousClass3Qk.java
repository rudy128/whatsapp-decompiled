package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.3Qk  reason: invalid class name */
public final class AnonymousClass3Qk extends LinearLayout implements AnonymousClass009 {
    public TextEmojiLabel A00;
    public C18000vb A01;
    public AnonymousClass4XG A02;
    public AnonymousClass1VU A03;
    public C18030ve A04;
    public C28931bI A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public WaTextView A08;
    public final C18100vl A09;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setSubgroupActivationExperiment(AnonymousClass4XG r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    private final ImageView getMemberSuggestedGroupsIcon() {
        return AnonymousClass3MX.A0J(this.A09);
    }

    private final void setupNewSuggestedGroupsViews(int i) {
        TextEmojiLabel textEmojiLabel = this.A00;
        if (textEmojiLabel != null) {
            textEmojiLabel.setText(C72483Me.A0W(getResources(), i, 2131755226));
        }
        C28931bI r3 = this.A05;
        if (r3 != null) {
            AnonymousClass3MX.A0M(r3).setText(getWhatsAppLocale().A0L().format(Integer.valueOf(i)));
            C42481yF.A06(getContext(), r3.A02());
        }
    }

    public final void A00(AnonymousClass4UX r5) {
        int i;
        C89894dC.A00(this, r5, 41);
        int ordinal = r5.A00.ordinal();
        int i2 = 2131891956;
        if (ordinal != 0) {
            i2 = 2131891963;
        }
        WaTextView waTextView = this.A08;
        if (waTextView != null) {
            waTextView.setText(i2);
        }
        if (ordinal != 0) {
            i = 2131755229;
        } else {
            int i3 = r5.A01.A00;
            if (i3 > 0) {
                setupNewSuggestedGroupsViews(i3);
                return;
            }
            i = 2131755227;
        }
        int i4 = r5.A01.A01;
        TextEmojiLabel textEmojiLabel = this.A00;
        if (textEmojiLabel != null) {
            textEmojiLabel.setText(C72473Md.A0k(getResources(), i4, i));
        }
        AnonymousClass3Ma.A1M(this.A05);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public final AnonymousClass4XG getSubgroupActivationExperiment() {
        AnonymousClass4XG r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("subgroupActivationExperiment");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public AnonymousClass3Qk(Context context) {
        super(context);
        Drawable A002;
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A04 = AnonymousClass10E.A8r(A0O);
            this.A03 = AnonymousClass3MZ.A0s(A0O);
            this.A02 = (AnonymousClass4XG) A0O.AAX.get();
            this.A01 = AnonymousClass10E.A6Q(A0O);
        }
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5FS(this));
        boolean A052 = C18020vd.A05(C18040vf.A02, getSubgroupActivationExperiment().A01, 8128);
        Resources resources = getResources();
        if (A052) {
            A002 = AnonymousClass1VU.A00(context.getTheme(), resources, AnonymousClass3Ma.A0J(), getAbProps(), 2131233358);
        } else {
            A002 = C40501uo.A00(context.getTheme(), resources, 2131233359);
        }
        View.inflate(getContext(), 2131625995, this);
        setId(2131432462);
        C72473Md.A0y(this);
        setBackgroundResource(2131232942);
        setOrientation(0);
        AnonymousClass3MY.A14(getResources(), this, 2131167078);
        this.A08 = AnonymousClass3MW.A0U(this, 2131432474);
        this.A00 = AnonymousClass3MX.A0W(this, 2131432463);
        this.A05 = C72453Mb.A0s(this, 2131432976);
        if (A002 != null) {
            AnonymousClass3MX.A0J(this.A09).setImageDrawable(A002);
        }
    }
}
