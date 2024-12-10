package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhoto;

/* renamed from: X.3SD  reason: invalid class name */
public final class AnonymousClass3SD extends ConstraintLayout implements AnonymousClass009 {
    public AnonymousClass1CJ A00;
    public AnonymousClass4ZS A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;

    public AnonymousClass3SD(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A00 = AnonymousClass3Ma.A0d(A0O);
            this.A01 = (AnonymousClass4ZS) A0O.A00.A2v.get();
        }
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5FZ(this));
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5FY(this));
        this.A06 = AnonymousClass1DF.A01(new C102065Fa(this));
        View.inflate(context, 2131625527, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167265);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131167291);
        marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setLayoutParams(marginLayoutParams);
    }

    public final void A07(C94064jz r10, C37451pZ r11) {
        CharSequence charSequence;
        C18070vi.A0d(r11, 0);
        getGroupPhoto().A06(r10.A01, r11);
        WaTextView groupName = getGroupName();
        AnonymousClass4ZN r0 = r10.A02;
        if (r0 != null) {
            charSequence = AnonymousClass4ZN.A00(this, r0);
        } else {
            charSequence = null;
        }
        groupName.setText(charSequence);
        WaTextView mediaCount = getMediaCount();
        Resources resources = getResources();
        int i = r10.A00;
        AnonymousClass3MX.A1E(resources, mediaCount, new Object[]{getLargeNumberFormatterUtil().A02(AnonymousClass3MX.A05(this), Integer.valueOf(i), false)}, 2131755055, i);
        C89894dC.A00(this, r10, 44);
    }

    public final void setChatsCache(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setLargeNumberFormatterUtil(AnonymousClass4ZS r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    private final WaTextView getGroupName() {
        return (WaTextView) AnonymousClass3MX.A14(this.A04);
    }

    private final GroupPhoto getGroupPhoto() {
        return (GroupPhoto) AnonymousClass3MX.A14(this.A05);
    }

    private final WaTextView getMediaCount() {
        return (WaTextView) AnonymousClass3MX.A14(this.A06);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1CJ getChatsCache() {
        AnonymousClass1CJ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public final AnonymousClass4ZS getLargeNumberFormatterUtil() {
        AnonymousClass4ZS r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("largeNumberFormatterUtil");
        throw null;
    }
}
