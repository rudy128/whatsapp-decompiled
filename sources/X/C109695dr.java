package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.support.DescribeProblemActivity;

/* renamed from: X.5dr  reason: invalid class name and case insensitive filesystem */
public class C109695dr extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C109695dr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onClick(View view) {
        switch (this.A00) {
            case 0:
                RegisterAsCompanionLinkCodeActivity registerAsCompanionLinkCodeActivity = (RegisterAsCompanionLinkCodeActivity) this.A01;
                C26721Tf r0 = registerAsCompanionLinkCodeActivity.A02;
                if (r0 != null) {
                    C26721Tf.A00(r0).A04();
                    registerAsCompanionLinkCodeActivity.finish();
                    return;
                }
                C18070vi.A11("companionRegistrationManager");
                throw null;
            case 1:
                ExportMigrationActivity exportMigrationActivity = (ExportMigrationActivity) this.A01;
                C108965cb.A0S(exportMigrationActivity).A00(exportMigrationActivity.A0L, 2);
                exportMigrationActivity.A01.A08(exportMigrationActivity, AnonymousClass1LU.A00(exportMigrationActivity));
                return;
            case 2:
                C18070vi.A0d(view, 0);
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                dialogFragment.startActivityForResult(AnonymousClass1LU.A06(AnonymousClass3MY.A04(view)), 0);
                dialogFragment.A28();
                return;
            case 3:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A01;
                describeProblemActivity.startActivity(AnonymousClass3MY.A07(describeProblemActivity.A01));
                return;
            default:
                C108945cZ.A1P(this.A01);
                return;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(textPaint, 0);
                AnonymousClass3MX.A19((Context) this.A01, textPaint, 2131101209);
                textPaint.setUnderlineText(false);
                return;
            case 1:
                textPaint.setUnderlineText(false);
                Context context = (Context) this.A01;
                i = C19740yt.A00(context, C72463Mc.A02(context));
                break;
            case 2:
                C18070vi.A0d(textPaint, 0);
                Fragment fragment = (Fragment) this.A01;
                i = AnonymousClass3MZ.A02(fragment.A1n(), fragment.A14(), 2130968583, 2131099679);
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setColor(i);
    }
}
