package com.whatsapp.snapl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass21X;
import X.AnonymousClass6XJ;
import X.AnonymousClass77U;
import X.AnonymousClass7BA;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C127746er;
import X.C130736jv;
import X.C133406oh;
import X.C135876su;
import X.C17880vN;
import X.C17890vO;
import X.C19830z4;
import X.C25321Nt;
import X.C26378Cye;
import X.C27091Ur;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.productinfra.music.gating.MusicGating;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.snapl.SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1", f = "SnaplHeroPlayerHelper.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass21X $message;
    public final /* synthetic */ AnonymousClass7BA $snaplHeroPlayerListener;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C130736jv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1(AnonymousClass21X r2, C130736jv r3, AnonymousClass7BA r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$message = r2;
        this.$snaplHeroPlayerListener = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1(this.$message, this.this$0, this.$snaplHeroPlayerListener, r6);
    }

    public final Object invokeSuspend(Object obj) {
        Long l;
        AnonymousClass7BA r1;
        C130736jv r6;
        String str;
        long j;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = null;
        if (i == 0) {
            C30691eM.A01(obj);
            ((C25321Nt) this.this$0.A05.get()).A04(this.$message);
            AnonymousClass77U A00 = AnonymousClass6XJ.A00(this.$message);
            if (A00 == null || (str = A00.A03) == null) {
                this.this$0.A00.A0G("SnaplHeroPlayerHelper/mediaId", "mediaId is null but hasEmbeddedMusic is true", false);
                l = new Long(0);
                if (A00 == null) {
                    this.this$0.A00.A0H("SNAPL", "prepare_metadata", false, "embeddedMusic == null");
                }
            } else {
                l = new Long(Long.parseLong(str));
            }
            C127746er r7 = (C127746er) this.this$0.A07.get();
            String str3 = r7.A00;
            if (str3 == null) {
                C19830z4 r62 = r7.A01;
                str3 = C17890vO.A0B(r62).getString("pref_music_persistent_id", (String) null);
                if (str3 == null) {
                    str3 = C108985cd.A0f();
                    C17880vN.A1E(C19830z4.A00(r62), "pref_music_persistent_id", str3);
                }
                r7.A00 = str3;
            }
            r1 = this.$snaplHeroPlayerListener;
            r1.A00 = new C135876su(l.longValue(), str3, "status_viewer", "organic");
            if (A00 != null) {
                r6 = this.this$0;
                this.L$0 = A00;
                this.L$1 = r6;
                this.L$2 = r1;
                this.label = 1;
                obj = ((MusicGating) r6.A06.get()).A00(A00, this);
                if (obj == r4) {
                    return r4;
                }
            }
            return C27621Wu.A00;
        } else if (i == 1) {
            r1 = (AnonymousClass7BA) this.L$2;
            r6 = (C130736jv) this.L$1;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        String A03 = ((C27091Ur) r6.A04.get()).A03();
        if (A03 != null) {
            str2 = C108975cc.A0e(A03);
        }
        C133406oh r8 = new C133406oh();
        if (str2 != null) {
            r8.A00.put("country", str2);
        }
        r8.A00.put("is_copyright_muted", obj);
        C26378Cye cye = r1.A01.A06;
        if (cye != null) {
            j = cye.A09();
            long j2 = C108965cb.A0E(cye).A0X;
            if (j2 < 0) {
                j2 = -1;
            }
            if (j > j2) {
                j = j2;
            }
        } else {
            j = 0;
        }
        AnonymousClass7BA.A01(r1, r8, "tags_changed", j);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnaplHeroPlayerHelper$maybeAddSnaplHeroPlayerListener$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
