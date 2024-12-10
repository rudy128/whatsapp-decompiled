package X;

import android.app.ProgressDialog;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5Sp  reason: invalid class name and case insensitive filesystem */
public final class C105595Sp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105595Sp(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        int i;
        C85954Po r0;
        String str2;
        ProgressDialog progressDialog;
        String A0Z;
        StringBuilder A10;
        ProgressDialog progressDialog2;
        ProgressDialog progressDialog3;
        C83194Ee r9 = (C83194Ee) obj;
        if (r9 instanceof AnonymousClass41Q) {
            InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
            if (inAppBugReportingActivity.A00 == null) {
                ProgressDialog progressDialog4 = new ProgressDialog(inAppBugReportingActivity);
                inAppBugReportingActivity.A00 = progressDialog4;
                progressDialog4.setCancelable(false);
                ProgressDialog progressDialog5 = inAppBugReportingActivity.A00;
                if (progressDialog5 != null) {
                    progressDialog5.setIndeterminate(true);
                }
                ProgressDialog progressDialog6 = inAppBugReportingActivity.A00;
                if (progressDialog6 != null) {
                    progressDialog6.setMessage(inAppBugReportingActivity.getString(2131896605));
                }
            }
            ProgressDialog progressDialog7 = inAppBugReportingActivity.A00;
            if (!(progressDialog7 == null || progressDialog7.isShowing() || (progressDialog3 = inAppBugReportingActivity.A00) == null)) {
                progressDialog3.show();
            }
        } else {
            if (r9 instanceof AnonymousClass41O) {
                InAppBugReportingActivity inAppBugReportingActivity2 = this.this$0;
                ProgressDialog progressDialog8 = inAppBugReportingActivity2.A00;
                if (!(progressDialog8 == null || !progressDialog8.isShowing() || (progressDialog2 = inAppBugReportingActivity2.A00) == null)) {
                    progressDialog2.cancel();
                }
                if (C18020vd.A05(C18040vf.A02, this.this$0.A0E, 2090)) {
                    InAppBugReportingActivity inAppBugReportingActivity3 = this.this$0;
                    String str3 = ((AnonymousClass41O) r9).A00;
                    ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass3MY.A0H(inAppBugReportingActivity3, 2131428461);
                    inAppBugReportingActivity3.A06 = constraintLayout;
                    if (constraintLayout == null) {
                        str2 = "bugReportForm";
                    } else {
                        constraintLayout.setVisibility(8);
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) AnonymousClass3MY.A0H(inAppBugReportingActivity3, 2131428462);
                        inAppBugReportingActivity3.A05 = constraintLayout2;
                        if (constraintLayout2 == null) {
                            str2 = "bugReportBottomBar";
                        } else {
                            constraintLayout2.setVisibility(8);
                            ViewStub viewStub = (ViewStub) AnonymousClass3MY.A0H(inAppBugReportingActivity3, 2131428463);
                            inAppBugReportingActivity3.A02 = viewStub;
                            if (viewStub == null) {
                                str2 = "bugSubmittedConfirmation";
                            } else {
                                viewStub.inflate();
                                inAppBugReportingActivity3.A04 = (TextView) AnonymousClass3MY.A0H(inAppBugReportingActivity3, 2131436024);
                                Matcher matcher = Pattern.compile("Bug ID: (.*)").matcher(str3);
                                if (matcher.find()) {
                                    A0Z = matcher.group(1);
                                    if (A0Z == null) {
                                        A0Z = "";
                                    }
                                    A10 = AnonymousClass000.A10();
                                    A10.append("https://www.internalfb.com/bug/");
                                    A10.append(A0Z);
                                } else {
                                    A0Z = C17890vO.A0Z(str3, AnonymousClass000.A10(), 'T');
                                    A10 = AnonymousClass000.A10();
                                    A10.append("https://www.internalfb.com/tasks/?t=");
                                    A10.append(str3);
                                }
                                String obj2 = A10.toString();
                                String A102 = AnonymousClass3Ma.A10(inAppBugReportingActivity3, A0Z, new Object[1], 0, 2131887466);
                                SpannableString spannableString = new SpannableString(A102);
                                C72713Nf r4 = new C72713Nf(inAppBugReportingActivity3, obj2);
                                int A0F = AnonymousClass1YF.A0F(A102, A0Z, 0, false);
                                spannableString.setSpan(r4, A0F, A0Z.length() + A0F, 33);
                                TextView textView = inAppBugReportingActivity3.A04;
                                if (textView != null) {
                                    textView.setText(spannableString);
                                    TextView textView2 = inAppBugReportingActivity3.A04;
                                    if (textView2 != null) {
                                        textView2.setMovementMethod(new C109685dq());
                                    }
                                }
                                C18070vi.A11("taskCreationMessage");
                                throw null;
                            }
                        }
                    }
                }
                r0 = C72473Md.A0V(this.this$0);
                str = null;
                i = 7;
                r0.A00(i, str);
            } else if (r9 instanceof AnonymousClass41N) {
                InAppBugReportingActivity inAppBugReportingActivity4 = this.this$0;
                ProgressDialog progressDialog9 = inAppBugReportingActivity4.A00;
                if (!(progressDialog9 == null || !progressDialog9.isShowing() || (progressDialog = inAppBugReportingActivity4.A00) == null)) {
                    progressDialog.cancel();
                }
                if (C18020vd.A05(C18040vf.A02, this.this$0.A0E, 2090)) {
                    InAppBugReportingActivity inAppBugReportingActivity5 = this.this$0;
                    View A08 = AnonymousClass3MX.A08(inAppBugReportingActivity5, 2131625780);
                    View A05 = C18070vi.A05(A08, 2131428621);
                    View A052 = C18070vi.A05(A08, 2131428619);
                    View A053 = C18070vi.A05(A08, 2131428585);
                    C73203Rj A00 = AnonymousClass4a6.A00(inAppBugReportingActivity5);
                    A00.A0c(A08);
                    A00.A0T(false);
                    C010105w A0L = AnonymousClass3MY.A0L(A00);
                    C90014dO.A00(A05, A0L, inAppBugReportingActivity5, 45);
                    C90014dO.A00(A052, A0L, inAppBugReportingActivity5, 46);
                    C90014dO.A00(A053, A0L, inAppBugReportingActivity5, 47);
                    A0L.show();
                }
                AnonymousClass00H r02 = this.this$0.A0M;
                if (r02 != null) {
                    r0 = (C85954Po) r02.get();
                    str = ((AnonymousClass41N) r9).A00;
                    i = 8;
                    r0.A00(i, str);
                } else {
                    str2 = "supportLogger";
                }
            } else if (r9 instanceof AnonymousClass41P) {
                this.this$0.setResult(-1);
                this.this$0.finish();
            }
            C18070vi.A11(str2);
            throw null;
        }
        return C27621Wu.A00;
    }
}
