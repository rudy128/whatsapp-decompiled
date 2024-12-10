package com.whatsapp.contact.sync;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1IX;
import X.AnonymousClass1OS;
import X.AnonymousClass1PY;
import X.AnonymousClass5WY;
import X.AnonymousClass8BT;
import X.B33;
import X.C17890vO;
import X.C18070vi;
import X.C19993A2g;
import X.C20125A8k;
import X.C21444AkB;
import X.C26931Ua;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.infra.graphql.generated.usync.ContactIntegrityQueryResponseImpl;
import com.whatsapp.infra.graphql.generated.usync.enums.GraphQLXWA2ContactsIntegrityState;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.contact.sync.FetchTask$run$1", f = "ContactIntegrityFetcher.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class FetchTask$run$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass5WY $request;
    public int label;
    public final /* synthetic */ C21444AkB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchTask$run$1(AnonymousClass5WY r2, C21444AkB akB, C30391dr r4) {
        super(2, r4);
        this.this$0 = akB;
        this.$request = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FetchTask$run$1(this.$request, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        ContactIntegrityQueryResponseImpl.Xwa2FetchWaUsers xwa2FetchWaUsers;
        GraphQLXWA2ContactsIntegrityState graphQLXWA2ContactsIntegrityState;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                AnonymousClass1PY r1 = this.this$0.A05;
                AnonymousClass5WY r0 = this.$request;
                C18070vi.A0b(r0);
                C19993A2g A01 = r1.A01(r0);
                this.label = 1;
                obj = A01.A01(this, B33.A00);
                if (obj == r2) {
                    return r2;
                }
            } catch (Exception e) {
                Log.e((Throwable) e);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass1IX A0A = ((ContactIntegrityQueryResponseImpl) obj).A0A(ContactIntegrityQueryResponseImpl.Xwa2FetchWaUsers.class, "xwa2_fetch_wa_users");
        if (!(A0A == null || (xwa2FetchWaUsers = (ContactIntegrityQueryResponseImpl.Xwa2FetchWaUsers) C29431cG.A0c(A0A)) == null)) {
            JSONObject jSONObject = xwa2FetchWaUsers.A00;
            C18070vi.A0W(jSONObject);
            ContactIntegrityQueryResponseImpl.Xwa2FetchWaUsers.InlineXWA2WAUserInterface.CommonIntegritySignalsInfo commonIntegritySignalsInfo = (ContactIntegrityQueryResponseImpl.Xwa2FetchWaUsers.InlineXWA2WAUserInterface.CommonIntegritySignalsInfo) new C20125A8k(jSONObject).A09(ContactIntegrityQueryResponseImpl.Xwa2FetchWaUsers.InlineXWA2WAUserInterface.CommonIntegritySignalsInfo.class, "common_integrity_signals_info");
            if (commonIntegritySignalsInfo != null) {
                JSONObject jSONObject2 = commonIntegritySignalsInfo.A00;
                if (AnonymousClass8BT.A03(jSONObject2) == -337938887 && (graphQLXWA2ContactsIntegrityState = (GraphQLXWA2ContactsIntegrityState) new C20125A8k(jSONObject2).A0E(GraphQLXWA2ContactsIntegrityState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "contacts_integrity_state")) != null) {
                    int ordinal = graphQLXWA2ContactsIntegrityState.ordinal();
                    if (ordinal == 2) {
                        this.this$0.A04.A1F(1);
                        if (this.this$0.A04.A0P() <= 0) {
                            C21444AkB akB = this.this$0;
                            akB.A04.A1N(AnonymousClass11P.A01(akB.A03));
                            C26931Ua r22 = this.this$0.A02;
                            C26931Ua.A00(r22, 1, AnonymousClass11P.A01(r22.A01));
                        }
                        this.this$0.A01.A08();
                        this.this$0.A06.set(0);
                    } else if (ordinal == 3) {
                        this.this$0.A04.A1F(3);
                        if (C17890vO.A0B(this.this$0.A04).getLong("native_contacts_enter_integrity_timelock_timestamp", 0) <= 0) {
                            C21444AkB akB2 = this.this$0;
                            akB2.A04.A1P(AnonymousClass11P.A01(akB2.A03));
                            C26931Ua r3 = this.this$0.A02;
                            C26931Ua.A00(r3, 3, AnonymousClass11P.A01(r3.A01));
                        }
                        this.this$0.A06.set(0);
                    } else if (ordinal == 1) {
                        this.this$0.A04.A1F(2);
                        if (C17890vO.A0B(this.this$0.A04).getLong("native_contacts_enter_integrity_pending_timestamp", 0) <= 0) {
                            C21444AkB akB3 = this.this$0;
                            akB3.A04.A1O(AnonymousClass11P.A01(akB3.A03));
                            C26931Ua r23 = this.this$0.A02;
                            C26931Ua.A00(r23, 2, AnonymousClass11P.A01(r23.A01));
                        }
                        C21444AkB akB4 = this.this$0;
                        C21444AkB.A00(akB4, akB4.A06);
                    }
                    this.this$0.A00.A0G();
                    this.this$0.A00.A0I();
                    return C27621Wu.A00;
                }
            }
        }
        C21444AkB akB5 = this.this$0;
        C21444AkB.A00(akB5, akB5.A06);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchTask$run$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
