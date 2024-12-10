package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass1DF;
import X.AnonymousClass1E5;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass7MD;
import X.AnonymousClass7vJ;
import X.C111235jF;
import X.C130606ji;
import X.C133576p0;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18110vm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import X.C63372sx;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.StatusPlaybackViewModel$loadStatuses$1", f = "StatusPlaybackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackViewModel$loadStatuses$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ AnonymousClass205 $messageKey;
    public final /* synthetic */ boolean $shouldUseStatusRanking;
    public final /* synthetic */ boolean $singleContactUpdate;
    public int label;
    public final /* synthetic */ C111235jF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackViewModel$loadStatuses$1(UserJid userJid, AnonymousClass205 r3, C111235jF r4, C30391dr r5, boolean z, boolean z2) {
        super(2, r5);
        this.$jid = userJid;
        this.this$0 = r4;
        this.$messageKey = r3;
        this.$singleContactUpdate = z;
        this.$shouldUseStatusRanking = z2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new StatusPlaybackViewModel$loadStatuses$1(this.$jid, this.$messageKey, this.this$0, r9, this.$singleContactUpdate, this.$shouldUseStatusRanking);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UserJid userJid = this.$jid;
            if (userJid != null) {
                C111235jF r5 = this.this$0;
                AnonymousClass205 r2 = this.$messageKey;
                boolean z = this.$singleContactUpdate;
                boolean z2 = this.$shouldUseStatusRanking;
                C133576p0 r3 = new C133576p0();
                boolean z3 = false;
                r5.A00 = 0;
                C18110vm A01 = AnonymousClass1DF.A01(new AnonymousClass7vJ(r2, r5));
                if (r2 == null || A01.getValue() == null) {
                    if (userJid == AnonymousClass1E5.A00) {
                        C63372sx A07 = r5.A06.A07();
                        if (A07 != null && !A07.A0D()) {
                            r3.A01(new AnonymousClass7MD(A07.A06()));
                            if (A07.A01() > 0) {
                                z3 = true;
                            }
                            r5.A03 = z3;
                        }
                    } else if (!r5.A08.A0a(userJid).A0U) {
                        Iterator it = r5.A0T(userJid, (C130606ji) C18070vi.A0E(r5.A0B), z, z2).iterator();
                        while (it.hasNext()) {
                            r3.A01(new AnonymousClass7MD((C63372sx) it.next()));
                        }
                        if (!C18020vd.A05(C18040vf.A02, r5.A07, 11431) && !r5.A03) {
                            z3 = true;
                        }
                        r5.A01 = z3;
                        r5.A00 = r3.A00(userJid.getRawString());
                    }
                    AnonymousClass3MW.A1X(r5.A0C, new StatusPlaybackViewModel$onStatusClick$1(userJid, r5, (C30391dr) null, z), C41561wd.A00(r5));
                    this.this$0.A05.A0E(r3);
                }
                C63372sx A08 = r5.A06.A08(userJid);
                if (A08 != null && !A08.A0D()) {
                    r3.A01(new AnonymousClass7MD(A08.A06()));
                    if (A08.A01() > 0) {
                        z3 = true;
                    }
                    r5.A02 = z3;
                }
                AnonymousClass3MW.A1X(r5.A0C, new StatusPlaybackViewModel$onStatusClick$1(userJid, r5, (C30391dr) null, z), C41561wd.A00(r5));
                this.this$0.A05.A0E(r3);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackViewModel$loadStatuses$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
