package com.whatsapp.consent.common;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C160928Ao;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.consent.DateOfBirthCollectionViewModel;
import com.whatsapp.consent.DateOfBirthConfirmationDialog;
import com.whatsapp.consent.DateOfBirthRemediationDialog;
import com.whatsapp.consent.DateOfBirthRemediationViewModel;
import com.whatsapp.pancake.dosa.DosaAgeConfirmationDialog;
import com.whatsapp.pancake.dosa.DosaCollectionViewModel;
import com.whatsapp.pancake.dosa.DosaRemediationConfirmationDialog;
import com.whatsapp.pancake.dosa.DosaRemediationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.common.AgeConfirmationDialog$onCreateDialog$1$1$1", f = "AgeConfirmationDialog.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
public final class AgeConfirmationDialog$onCreateDialog$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AgeConfirmationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AgeConfirmationDialog$onCreateDialog$1$1$1(AgeConfirmationDialog ageConfirmationDialog, C30391dr r3) {
        super(2, r3);
        this.this$0 = ageConfirmationDialog;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AgeConfirmationDialog$onCreateDialog$1$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AgeConfirmationDialog$onCreateDialog$1$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C160928Ao r0;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AgeConfirmationDialog ageConfirmationDialog = this.this$0;
            if (ageConfirmationDialog instanceof DosaRemediationConfirmationDialog) {
                r0 = (DosaRemediationViewModel) ((DosaRemediationConfirmationDialog) ageConfirmationDialog).A00.getValue();
            } else if (ageConfirmationDialog instanceof DosaAgeConfirmationDialog) {
                r0 = (DosaCollectionViewModel) ((DosaAgeConfirmationDialog) ageConfirmationDialog).A01.getValue();
            } else if (ageConfirmationDialog instanceof DateOfBirthRemediationDialog) {
                r0 = (DateOfBirthRemediationViewModel) ((DateOfBirthRemediationDialog) ageConfirmationDialog).A01.getValue();
            } else {
                r0 = (DateOfBirthCollectionViewModel) ((DateOfBirthConfirmationDialog) ageConfirmationDialog).A01.getValue();
            }
            this.label = 1;
            if (r0.BlJ(this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A28();
        return C27621Wu.A00;
    }
}
