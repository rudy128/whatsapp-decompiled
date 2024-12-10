package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1E2;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C108945cZ;
import X.C188829i3;
import X.C19760yx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C49502Qs;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel$submitPinForUsername$1", f = "UsernamePinEntryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernamePinEntryViewModel$submitPinForUsername$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $username;
    public final /* synthetic */ String $usernamePin;
    public int label;
    public final /* synthetic */ UsernamePinEntryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernamePinEntryViewModel$submitPinForUsername$1(UsernamePinEntryViewModel usernamePinEntryViewModel, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.this$0 = usernamePinEntryViewModel;
        this.$username = str;
        this.$usernamePin = str2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new UsernamePinEntryViewModel$submitPinForUsername$1(this.this$0, this.$username, this.$usernamePin, r6);
    }

    public final Object invokeSuspend(Object obj) {
        UserJid userJid;
        C49502Qs r4;
        C188829i3 r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C19760yx A05 = this.this$0.A00.A05(this.$username, this.$usernamePin);
            UserJid userJid2 = null;
            if (A05 == null || (r0 = (C188829i3) A05.A00) == null) {
                userJid = null;
            } else {
                userJid = r0.A0D;
            }
            if (userJid instanceof AnonymousClass1E2) {
                userJid2 = userJid;
            }
            AnonymousClass3MY.A1Y(this.this$0.A06, false);
            UsernamePinEntryViewModel usernamePinEntryViewModel = this.this$0;
            if (userJid2 == null) {
                AnonymousClass3MY.A1Y(usernamePinEntryViewModel.A07, true);
            } else {
                int ordinal = usernamePinEntryViewModel.A03.A00().ordinal();
                if (ordinal == 0) {
                    r4 = C49502Qs.USERNAME;
                } else if (ordinal == 1) {
                    r4 = C49502Qs.GENERAL;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                Context A0E = C108945cZ.A0E(usernamePinEntryViewModel.A01);
                Intent A06 = AnonymousClass3MY.A06(A0E, usernamePinEntryViewModel.A02, userJid2);
                A06.putExtra("chat_origin", r4.origin);
                A0E.startActivity(A06);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernamePinEntryViewModel$submitPinForUsername$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
