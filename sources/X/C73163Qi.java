package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3Qi  reason: invalid class name and case insensitive filesystem */
public class C73163Qi extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final TextEmojiLabel A08;

    public void onMeasure(int i, int i2) {
        this.A03 = true;
        TextEmojiLabel textEmojiLabel = this.A08;
        measureChild(textEmojiLabel, i, i2);
        setupTitleAndDescriptionMaxLines(AnonymousClass3MZ.A18(textEmojiLabel));
        super.onMeasure(i, i2);
    }

    private void setupTitleAndDescriptionMaxLines(String str) {
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel.getPaint().measureText(str) > ((float) textEmojiLabel.getMeasuredWidth())) {
            textEmojiLabel.setMaxLines(2);
            this.A06.setMaxLines(1);
            return;
        }
        textEmojiLabel.setMaxLines(1);
        this.A06.setMaxLines(2);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setSubText(String str, List list) {
        TextEmojiLabel textEmojiLabel = this.A07;
        textEmojiLabel.setVisibility(C72453Mb.A01(TextUtils.isEmpty(str) ? 1 : 0));
        if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.A0R(C43351zf.A02(getContext(), this.A00, str, list));
        }
    }

    public void setTitleAndDescription(String str, String str2, List list) {
        TextEmojiLabel textEmojiLabel;
        int i;
        CharSequence charSequence;
        TextEmojiLabel textEmojiLabel2 = this.A06;
        boolean z = false;
        textEmojiLabel2.setVisibility(C72453Mb.A01(TextUtils.isEmpty(str2) ? 1 : 0));
        if (this.A03 || this.A08.getMeasuredWidth() != 0) {
            z = true;
        }
        this.A03 = z;
        if (z) {
            setupTitleAndDescriptionMaxLines(str);
        }
        if (list == null || list.isEmpty()) {
            textEmojiLabel = this.A08;
            i = this.A05;
        } else {
            textEmojiLabel = this.A08;
            i = this.A04;
        }
        textEmojiLabel.setTextColor(i);
        Context context = getContext();
        C18000vb r1 = this.A00;
        textEmojiLabel.A0R(C43351zf.A02(context, r1, str, list));
        if (str2 != null) {
            charSequence = C43351zf.A02(getContext(), r1, str2, list);
        } else {
            charSequence = "";
        }
        textEmojiLabel2.A0R(charSequence);
    }

    public C73163Qi(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A03 = false;
        setOrientation(1);
        setGravity(16);
        View.inflate(getContext(), 2131625317, this);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(this, 2131430841);
        this.A08 = A0V;
        this.A06 = AnonymousClass3MX.A0V(this, 2131430839);
        this.A07 = AnonymousClass3MX.A0V(this, 2131430840);
        this.A04 = AnonymousClass3Ma.A00(context, 2130970340, 2131101312);
        this.A05 = AnonymousClass3Ma.A00(context, 2130970343, 2131101314);
        C43421zm.A04(A0V);
    }
}
