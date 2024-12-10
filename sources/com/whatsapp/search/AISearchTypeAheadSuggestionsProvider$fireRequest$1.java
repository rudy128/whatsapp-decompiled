package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass775;
import X.AnonymousClass77E;
import X.C134186qB;
import X.C136896ua;
import X.C1417676w;
import X.C18070vi;
import X.C18600wl;
import X.C22801Dg;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
public final class AISearchTypeAheadSuggestionsProvider$fireRequest$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C136896ua $performanceEvent;
    public final /* synthetic */ String $query;
    public int label;
    public final /* synthetic */ C134186qB this$0;

    @DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$fireRequest$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r3, str, r6);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                try {
                    if (!C134186qB.this.A0E.A09()) {
                        return C27621Wu.A00;
                    }
                    r3.A02();
                    C134186qB r0 = C134186qB.this;
                    String str = str;
                    this.label = 1;
                    obj = r0.A0F.A01(str, this, r0.A04);
                    if (obj == r3) {
                        return r3;
                    }
                } catch (Exception unused) {
                    String trim = str.trim();
                    if (!trim.isEmpty()) {
                        Matcher matcher = Pattern.compile("\\s+").matcher(trim);
                        int i2 = 1;
                        while (true) {
                            if (!matcher.find()) {
                                break;
                            }
                            i2++;
                            if (i2 >= 3) {
                                C134186qB r02 = C134186qB.this;
                                String str2 = str;
                                ArrayList A13 = AnonymousClass000.A13();
                                C22801Dg r32 = r02.A08;
                                Collection collection = (Collection) r32.A06();
                                if (collection != null) {
                                    A13.addAll(collection);
                                }
                                Iterator it = A13.iterator();
                                C18070vi.A0X(it);
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    C18070vi.A0X(next);
                                    String str3 = ((AnonymousClass77E) next).A02;
                                    if (str3 == null || str3.equals("entrypoint_echo")) {
                                        it.remove();
                                    }
                                }
                                A13.add(0, new AnonymousClass77E((AnonymousClass775) null, str2, (String) null, "entrypoint_echo", (String) null));
                                r32.A0E(A13);
                            }
                        }
                    }
                    r3.A01();
                    r3.A04(AnonymousClass000.A0h(), AnonymousClass3MW.A0v(3), new Long((long) str.length()), (Long) null);
                    r3.A03();
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            AnonymousClass1D6 r13 = (AnonymousClass1D6) obj;
            boolean A1Y = AnonymousClass000.A1Y(r13.second);
            List list = ((C1417676w) r13.first).A00;
            r3.A01();
            C134186qB.this.A08.A0E(list);
            r3.A04(Boolean.valueOf(A1Y), AnonymousClass3MW.A0v(0), new Long((long) str.length()), new Long((long) list.size()));
            r3.A03();
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AISearchTypeAheadSuggestionsProvider$fireRequest$1(C134186qB r2, C136896ua r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$performanceEvent = r3;
        this.$query = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AISearchTypeAheadSuggestionsProvider$fireRequest$1(this.this$0, this.$performanceEvent, this.$query, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C134186qB r5 = this.this$0;
            C18600wl r4 = r5.A0I;
            final C136896ua r3 = this.$performanceEvent;
            final String str = this.$query;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AISearchTypeAheadSuggestionsProvider$fireRequest$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
