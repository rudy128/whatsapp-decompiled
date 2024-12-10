package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.5cl  reason: invalid class name and case insensitive filesystem */
public class C109065cl extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C109065cl(IdentityVerificationActivity identityVerificationActivity, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = identityVerificationActivity;
        this.A03 = str;
        this.A02 = str2;
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            IdentityVerificationActivity.A0v((IdentityVerificationActivity) this.A01, this.A03, this.A02);
            return;
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A01;
        C130576jf r0 = identityVerificationActivity.A0G;
        if (r0 == null) {
            C18070vi.A11("soteriaViewHolder");
            throw null;
        }
        TextEmojiLabel textEmojiLabel = r0.A04;
        textEmojiLabel.setText(this.A03);
        Resources resources = textEmojiLabel.getResources();
        C130576jf r02 = identityVerificationActivity.A0G;
        if (r02 == null) {
            C18070vi.A11("soteriaViewHolder");
            throw null;
        }
        textEmojiLabel.setTextColor(AnonymousClass3Ma.A01(r02.A04.getContext(), resources, 2130970831, 2131102246));
        textEmojiLabel.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
        C130576jf r03 = identityVerificationActivity.A0G;
        if (r03 == null) {
            C18070vi.A11("soteriaViewHolder");
            throw null;
        }
        TextEmojiLabel textEmojiLabel2 = r03.A03;
        textEmojiLabel2.setText(this.A02);
        textEmojiLabel2.setAlpha(0.0f);
        textEmojiLabel2.animate().alpha(1.0f).setDuration(150).setListener((Animator.AnimatorListener) null);
    }
}
