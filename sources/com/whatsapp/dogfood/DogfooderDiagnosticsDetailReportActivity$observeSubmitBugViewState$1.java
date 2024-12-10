package com.whatsapp.dogfood;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4ET;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C80703xo;
import X.C80713xp;
import X.C80723xq;
import android.widget.CheckBox;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1", f = "DogfooderDiagnosticsDetailReportActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DogfooderDiagnosticsDetailReportActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1(DogfooderDiagnosticsDetailReportActivity dogfooderDiagnosticsDetailReportActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = dogfooderDiagnosticsDetailReportActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1 dogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1 = new DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1(this.this$0, r4);
        dogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1.L$0 = obj;
        return dogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1;
    }

    public final Object invokeSuspend(Object obj) {
        CheckBox checkBox;
        String A0Z;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4ET r4 = (AnonymousClass4ET) this.L$0;
            boolean z = false;
            if (r4 instanceof C80713xp) {
                DogfooderDiagnosticsDetailReportActivity dogfooderDiagnosticsDetailReportActivity = this.this$0;
                Integer A0v = AnonymousClass3MW.A0v(2131889543);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Task created successfully, task ID: ");
                String str = ((C80713xp) r4).A00;
                Matcher matcher = Pattern.compile("Bug ID: (.*)").matcher(str);
                if (matcher.find()) {
                    A0Z = matcher.group(1);
                    if (A0Z == null) {
                        A0Z = "";
                    }
                } else {
                    A0Z = C17890vO.A0Z(str, AnonymousClass000.A10(), 'T');
                }
                dogfooderDiagnosticsDetailReportActivity.CMx(A0v, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, AnonymousClass000.A0y(A0Z, A10), (Object[]) null);
                WDSButton wDSButton = this.this$0.A06;
                if (wDSButton == null) {
                    C18070vi.A11("submitButton");
                    throw null;
                }
                wDSButton.setEnabled(false);
                WDSButton wDSButton2 = this.this$0.A06;
                if (wDSButton2 == null) {
                    C18070vi.A11("submitButton");
                    throw null;
                }
                wDSButton2.setText("Submitted");
                checkBox = this.this$0.A00;
                if (checkBox == null) {
                    C18070vi.A11("consentCheckbox");
                    throw null;
                }
            } else if (r4 instanceof C80703xo) {
                DogfooderDiagnosticsDetailReportActivity dogfooderDiagnosticsDetailReportActivity2 = this.this$0;
                Integer A0v2 = AnonymousClass3MW.A0v(2131889542);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Task create unsuccessful, error: ");
                dogfooderDiagnosticsDetailReportActivity2.CMx(A0v2, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, AnonymousClass000.A0y(((C80703xo) r4).A00, A102), (Object[]) null);
                WDSButton wDSButton3 = this.this$0.A06;
                if (wDSButton3 == null) {
                    C18070vi.A11("submitButton");
                    throw null;
                }
                z = true;
                wDSButton3.setEnabled(true);
                WDSButton wDSButton4 = this.this$0.A06;
                if (wDSButton4 == null) {
                    C18070vi.A11("submitButton");
                    throw null;
                }
                wDSButton4.setText("Retry");
                checkBox = this.this$0.A00;
                if (checkBox == null) {
                    C18070vi.A11("consentCheckbox");
                    throw null;
                }
            } else if (r4 instanceof C80723xq) {
                WDSButton wDSButton5 = this.this$0.A06;
                if (wDSButton5 != null) {
                    wDSButton5.setEnabled(false);
                    WDSButton wDSButton6 = this.this$0.A06;
                    if (wDSButton6 != null) {
                        wDSButton6.setText("Pending...");
                        checkBox = this.this$0.A00;
                        if (checkBox == null) {
                            C18070vi.A11("consentCheckbox");
                            throw null;
                        }
                    }
                }
                C18070vi.A11("submitButton");
                throw null;
            } else {
                throw AnonymousClass3MW.A14();
            }
            checkBox.setEnabled(z);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DogfooderDiagnosticsDetailReportActivity$observeSubmitBugViewState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
