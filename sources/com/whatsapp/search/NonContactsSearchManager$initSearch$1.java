package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C130976kJ;
import X.C18600wl;
import X.C188829i3;
import X.C24296Byt;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.CQU;
import com.whatsapp.calling.dialer.DialerContactQuerySyncManager;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.NonContactsSearchManager$initSearch$1", f = "NonContactsSearchManager.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class NonContactsSearchManager$initSearch$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $query;
    public int label;
    public final /* synthetic */ C130976kJ this$0;

    @DebugMetadata(c = "com.whatsapp.search.NonContactsSearchManager$initSearch$1$1", f = "NonContactsSearchManager.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.search.NonContactsSearchManager$initSearch$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(str, r5);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass1E7 r1;
            UserJid userJid;
            C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                try {
                    DialerContactQuerySyncManager dialerContactQuerySyncManager = C130976kJ.this.A07;
                    String str = str;
                    this.label = 1;
                    obj = dialerContactQuerySyncManager.A00(str, this);
                    if (obj == r4) {
                        return r4;
                    }
                } catch (Exception unused) {
                    C130976kJ.this.A04.A0E((Object) null);
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            CQU cqu = (CQU) obj;
            if (cqu.A00 == C24296Byt.SUCCESS_USER_IN_WA) {
                C188829i3 r0 = cqu.A02;
                if (r0 == null || (userJid = r0.A0D) == null) {
                    r1 = null;
                } else {
                    r1 = C130976kJ.this.A08.A0H(userJid);
                }
                C130976kJ.this.A04.A0E(r1);
            } else {
                C130976kJ.this.A04.A0E((Object) null);
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonContactsSearchManager$initSearch$1(C130976kJ r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$query = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new NonContactsSearchManager$initSearch$1(this.this$0, this.$query, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C130976kJ r4 = this.this$0;
            C18600wl r3 = r4.A0A;
            final String str = this.$query;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NonContactsSearchManager$initSearch$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
