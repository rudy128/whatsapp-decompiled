package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass17K;
import X.AnonymousClass1BI;
import X.AnonymousClass1E1;
import X.AnonymousClass1E2;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C130756jx;
import X.C17890vO;
import X.C18070vi;
import X.C188829i3;
import X.C19760yx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameSearchManager$queryUsername$2", f = "UsernameSearchManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSearchManager$queryUsername$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $username;
    public final /* synthetic */ String $usernamePin;
    public int label;
    public final /* synthetic */ C130756jx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSearchManager$queryUsername$2(C130756jx r2, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$username = str;
        this.$usernamePin = str2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new UsernameSearchManager$queryUsername$2(this.this$0, this.$username, this.$usernamePin, r6);
    }

    public final Object invokeSuspend(Object obj) {
        PhoneUserJid A0D;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C19760yx A05 = this.this$0.A04.A05(this.$username, this.$usernamePin);
            if (A05 != null) {
                AnonymousClass1E7 r3 = (AnonymousClass1E7) A05.A01;
                if (r3 == null) {
                    r3 = new AnonymousClass1E7((AnonymousClass1BI) null);
                }
                C188829i3 r2 = (C188829i3) A05.A00;
                if (r2.A04 == 1) {
                    String str = this.$username;
                    String str2 = r2.A0J;
                    if (str == null ? str == str2 : !(str2 == null || !str.equalsIgnoreCase(str2))) {
                        r3.A0R = C17890vO.A0Z(str2, AnonymousClass000.A10(), '@');
                        C130756jx r22 = this.this$0;
                        AnonymousClass1E1 r1 = (AnonymousClass1E1) r3.A06(AnonymousClass1E2.class);
                        if (!(r1 == null || (A0D = r22.A05.A0D(r1)) == null)) {
                            r3 = r22.A03.A0H(A0D);
                            if (r3.A0H == null) {
                                r3.A0R = AnonymousClass17K.A06(A0D.user);
                            }
                        }
                        this.this$0.A02.A0E(C18070vi.A0M(r3));
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameSearchManager$queryUsername$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
