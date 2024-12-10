package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.util.List;

/* renamed from: X.759  reason: invalid class name */
public class AnonymousClass759 implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass759(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        SpannableStringBuilder spannableStringBuilder;
        switch (this.A00) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                Dialog dialog = dialogFragment.A03;
                if (dialog != null) {
                    dialogFragment.onDismiss(dialog);
                    return;
                }
                return;
            case 1:
            case 2:
                C108965cb.A0y((Activity) this.A01);
                return;
            case 3:
                ((AnonymousClass5ZY) this.A01).BEw();
                return;
            case 4:
                ((MediaComposerActivity) this.A01).A1U = false;
                return;
            case 5:
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
                if (!AnonymousClass4Yv.A02(mediaComposerActivity)) {
                    mediaComposerActivity.A0a.A07(mediaComposerActivity.A0X.A0G());
                    AnonymousClass7JN r2 = mediaComposerActivity.A0a;
                    boolean A0F = mediaComposerActivity.A0X.A0F();
                    C127436eM r0 = r2.A08;
                    if (A0F) {
                        r0.A01.setFilterSwipeTextVisibility(0);
                    }
                    C109235d2 r02 = mediaComposerActivity.A0b;
                    C135316s0 r3 = r02.A04;
                    if (r3 == null) {
                        CaptionFragment captionFragment = r02.A03;
                        if (captionFragment != null) {
                            r3 = captionFragment.A27();
                        } else {
                            r3 = new C135316s0((CharSequence) null, (String) null, (List) null);
                        }
                    }
                    Uri A0A = mediaComposerActivity.A0X.A0A();
                    if (A0A != null) {
                        AnonymousClass72S A02 = mediaComposerActivity.A1q.A02(A0A);
                        if (A02.A0G() == null) {
                            A02.A0S(A02.A0H());
                        }
                        String A0G = A02.A0G();
                        List list = r3.A01;
                        ((C58432kg) mediaComposerActivity.A17.get()).A01(A0G, list);
                        String str = r3.A00;
                        A02.A0P(str);
                        if (A02.A0E() != null) {
                            spannableStringBuilder = AnonymousClass3MW.A09(A02.A0E());
                            mediaComposerActivity.A0l.A06(mediaComposerActivity, spannableStringBuilder, (AnonymousClass1BI) null, list, true);
                        } else {
                            spannableStringBuilder = null;
                        }
                        mediaComposerActivity.A0a.A06(spannableStringBuilder);
                        if (str != null) {
                            AnonymousClass7JN.A00(mediaComposerActivity).A0B.setMentionableText(str, list);
                        }
                    } else {
                        Log.e("MediaComposerActivity/captionentry/dismiss/current uri is null");
                    }
                    C109235d2 r1 = mediaComposerActivity.A0b;
                    if (r1.A06) {
                        if (C108975cc.A1H(mediaComposerActivity.A1D) && mediaComposerActivity.A1t.get() == C122506Qq.GONE) {
                            MediaComposerActivity.A11(mediaComposerActivity);
                            return;
                        } else if (mediaComposerActivity.A1Z) {
                            mediaComposerActivity.A03.A0G("MediaComposer/sendMedia/avoided double send", TextUtils.join(", ", AnonymousClass7JS.A03(mediaComposerActivity)), true);
                            return;
                        } else {
                            AnonymousClass7JS.A05(mediaComposerActivity);
                            MediaComposerActivity.A12(mediaComposerActivity);
                            return;
                        }
                    } else if (r1.A05) {
                        MediaComposerActivity.A1E(mediaComposerActivity, r1.A07);
                        return;
                    } else if (r1.A08) {
                        mediaComposerActivity.C6h();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                AnonymousClass7JF.A02((AnonymousClass7JF) this.A01);
                return;
            case 9:
                ((TextStatusComposerFragment) this.A01).A1A = false;
                return;
            case 10:
                Activity activity = (Activity) this.A01;
                C18070vi.A0d(activity, 0);
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    activity.finish();
                    return;
                }
                return;
            default:
                AnonymousClass6Gp r03 = (AnonymousClass6Gp) C108975cc.A0Z((Reference) this.A01);
                if (r03 != null) {
                    r03.A0N();
                    return;
                }
                return;
        }
    }
}
