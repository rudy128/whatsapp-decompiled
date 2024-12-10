package X;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.99g  reason: invalid class name */
public final class AnonymousClass99g extends C177919Bc {
    public final boolean A00;
    public final /* synthetic */ C1775899j A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r5 != false) goto L_0x0007;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass99g(X.C1775899j r2, boolean r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            r1.A01 = r2
            if (r4 == 0) goto L_0x0007
            r0 = 0
            if (r5 == 0) goto L_0x0008
        L_0x0007:
            r0 = 1
        L_0x0008:
            r1.<init>(r2, r3, r4, r0)
            r1.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass99g.<init>(X.99j, boolean, boolean, boolean):void");
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        int intValue;
        TextView textView;
        int i;
        Integer[] numArr = (Integer[]) objArr;
        C1775899j r1 = this.A01;
        int intValue2 = numArr[0].intValue();
        C166678dR r9 = r1.A03.A00;
        if (r9 instanceof RestoreFromBackupActivity) {
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r9;
            if (intValue2 - restoreFromBackupActivity.A00 > 0) {
                restoreFromBackupActivity.A00 = intValue2;
                if (intValue2 % 10 == 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("restore>RestoreFromBackupActivity/msgstore-restore-progress:");
                    A10.append(intValue2);
                    C17890vO.A1A(A10, "%");
                }
                if (intValue2 <= 100) {
                    if (intValue2 < 80) {
                        textView = restoreFromBackupActivity.A03;
                        C17960vV.A05(textView);
                        i = 2131895870;
                    } else if (intValue2 < 90) {
                        textView = restoreFromBackupActivity.A03;
                        C17960vV.A05(textView);
                        i = 2131895868;
                    } else {
                        if (intValue2 < 100) {
                            textView = restoreFromBackupActivity.A03;
                            C17960vV.A05(textView);
                            i = 2131895867;
                        }
                        ProgressBar progressBar = restoreFromBackupActivity.A01;
                        C17960vV.A05(progressBar);
                        progressBar.setIndeterminate(true);
                    }
                    AnonymousClass3MY.A0y(restoreFromBackupActivity, textView, new Object[]{restoreFromBackupActivity.A00.A0M().format(((double) intValue2) / 100.0d)}, i);
                    ProgressBar progressBar2 = restoreFromBackupActivity.A01;
                    C17960vV.A05(progressBar2);
                    progressBar2.setIndeterminate(true);
                }
            }
        }
        C161058Bf r0 = C1775899j.A0J;
        if (r0 != null && r0.getProgress() != (intValue = numArr[0].intValue())) {
            C1775899j.A0J.setProgress(intValue);
        }
    }
}
