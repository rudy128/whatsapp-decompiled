package X;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: X.0NP  reason: invalid class name */
public class AnonymousClass0NP {
    public final View A00;
    public final Object A01;

    public static AnonymousClass0NP A00(View view, ContentCaptureSession contentCaptureSession) {
        return new AnonymousClass0NP(view, contentCaptureSession);
    }

    public AutofillId A01(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        C04290Mp A002 = AnonymousClass0FU.A00(this.A00);
        A002.getClass();
        return C04980Pt.A02(A002.A01(), (ContentCaptureSession) this.A01, j);
    }

    public AnonymousClass0NT A02(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass0NT.A00(C04980Pt.A01(autofillId, (ContentCaptureSession) this.A01, j));
        }
        return null;
    }

    public void A03(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C04980Pt.A04(autofillId, (ContentCaptureSession) this.A01, charSequence);
        }
    }

    public void A04(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AnonymousClass0FQ.A00((ContentCaptureSession) this.A01, list);
        } else if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A002 = C04980Pt.A00(view, contentCaptureSession);
            AnonymousClass0FP.A00(A002).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C04980Pt.A03(A002, contentCaptureSession);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C04980Pt.A03((ViewStructure) list.get(i2), contentCaptureSession);
            }
            ViewStructure A003 = C04980Pt.A00(view, contentCaptureSession);
            AnonymousClass0FP.A00(A003).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C04980Pt.A03(A003, contentCaptureSession);
        }
    }

    public void A05(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C04290Mp A002 = AnonymousClass0FU.A00(this.A00);
            A002.getClass();
            C04980Pt.A05(A002.A01(), (ContentCaptureSession) this.A01, jArr);
        } else if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A003 = C04980Pt.A00(view, contentCaptureSession);
            AnonymousClass0FP.A00(A003).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C04980Pt.A03(A003, contentCaptureSession);
            C04290Mp A004 = AnonymousClass0FU.A00(view);
            A004.getClass();
            C04980Pt.A05(A004.A01(), contentCaptureSession, jArr);
            ViewStructure A005 = C04980Pt.A00(view, contentCaptureSession);
            AnonymousClass0FP.A00(A005).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C04980Pt.A03(A005, contentCaptureSession);
        }
    }

    public AnonymousClass0NP(View view, ContentCaptureSession contentCaptureSession) {
        this.A01 = contentCaptureSession;
        this.A00 = view;
    }
}
