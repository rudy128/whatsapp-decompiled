package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterInsightsResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterInsightMetricStatus;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.43h  reason: invalid class name and case insensitive filesystem */
public final class C821643h extends AMB {
    public static final C87234Uu A03 = new C87234Uu(10, "FOLLOWER", 30, true, false);
    public static final C87234Uu A04 = new C87234Uu((Integer) null, "FOLLOWER", 30, false, false);
    public static final C87234Uu A05 = new C87234Uu(30, "FOLLOWS", 1, false, false);
    public static final C87234Uu A06 = new C87234Uu((Integer) null, "NET_FOLLOWS", 30, false, false);
    public static final C87234Uu A07 = new C87234Uu((Integer) null, "NEW_UNIQUE_VISITORS", 30, false, false);
    public static final C87234Uu A08 = new C87234Uu(30, "UNFOLLOWS", 1, false, false);
    public static final C87234Uu A09 = new C87234Uu(10, "UNIQUE_VISITORS", 30, true, false);
    public static final C87234Uu A0A = new C87234Uu((Integer) null, "UNIQUE_VISITORS", 30, false, true);
    public static final C87234Uu A0B = new C87234Uu((Integer) null, "UNIQUE_VISITORS", 30, false, false);
    public static final AnonymousClass4UM A0C;
    public static final AnonymousClass4UM A0D;
    public AnonymousClass4QY A00;
    public final Set A01;
    public final C29681ch A02;

    static {
        C18460wS r2 = C18460wS.A00;
        A0D = new AnonymousClass4UM((Long) null, "UNAVAILABLE", r2);
        A0C = new AnonymousClass4UM((Long) null, "NETWORK_ERROR", r2);
    }

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        String str;
        Long l;
        AnonymousClass1IX r12;
        Object obj;
        List list;
        AnonymousClass1IX A0A2;
        Long l2;
        String str2;
        String str3;
        Long A042;
        String A0F;
        GraphQLXWA2NewsletterInsightMetricStatus graphQLXWA2NewsletterInsightMetricStatus;
        C20125A8k a8k2 = a8k;
        C18070vi.A0d(a8k2, 0);
        if (!this.A01) {
            Class<NewsletterInsightsResponseImpl.Xwa2NewsletterAdminInsights> cls = NewsletterInsightsResponseImpl.Xwa2NewsletterAdminInsights.class;
            C20125A8k A092 = a8k2.A09(cls, "xwa2_newsletter_admin_insights");
            if (A092 == null || (graphQLXWA2NewsletterInsightMetricStatus = (GraphQLXWA2NewsletterInsightMetricStatus) A092.A0D(GraphQLXWA2NewsletterInsightMetricStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "metrics_status")) == null) {
                str = null;
            } else if (graphQLXWA2NewsletterInsightMetricStatus.ordinal() == 1) {
                str = "OK";
            } else {
                str = "MISSING";
            }
            C20125A8k A093 = a8k2.A09(cls, "xwa2_newsletter_admin_insights");
            if (A093 == null || (A0F = A093.A0F("last_update_time")) == null) {
                l = null;
            } else {
                l = AnonymousClass1YD.A04(A0F);
            }
            C20125A8k A094 = a8k2.A09(cls, "xwa2_newsletter_admin_insights");
            if (A094 != null) {
                r12 = A094.A0A(NewsletterInsightsResponseImpl.Xwa2NewsletterAdminInsights.Result.class, "result");
            } else {
                r12 = null;
            }
            if (str == null || l == null || r12 == null) {
                AnonymousClass4QY r2 = this.A00;
                if (r2 != null) {
                    new C175058xv("Error parsing channel insights response");
                    r2.A00();
                    return;
                }
                return;
            }
            List A0t = C29431cG.A0t(this.A01);
            C25411Oc r1 = new C25411Oc(0, AnonymousClass3MX.A01(A0t));
            LinkedHashMap linkedHashMap = new LinkedHashMap(C72483Me.A07(r1));
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                int A002 = ((AnonymousClass20T) it).A00();
                Object obj2 = A0t.get(A002);
                Iterator it2 = r12.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((C20125A8k) obj).A00.optInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID) == A002 + 1) {
                        break;
                    }
                }
                C20125A8k a8k3 = (C20125A8k) obj;
                if (!(a8k3 == null || (A0A2 = a8k3.A0A(NewsletterInsightsResponseImpl.Xwa2NewsletterAdminInsights.Result.Values.class, "values")) == null)) {
                    ArrayList A0E = C29351c6.A0E(A0A2);
                    Iterator it3 = A0A2.iterator();
                    while (it3.hasNext()) {
                        C20125A8k a8k4 = (C20125A8k) it3.next();
                        String A0F2 = a8k4.A0F("timestamp");
                        if (A0F2 == null || (A042 = AnonymousClass1YD.A04(A0F2)) == null) {
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(TimeUnit.SECONDS.toMillis(A042.longValue()));
                        }
                        double optDouble = a8k4.A00.optDouble("value");
                        String A0F3 = a8k4.A0F("country");
                        if (A0F3 != null) {
                            str2 = A0F3.toUpperCase(Locale.ROOT);
                            C18070vi.A0X(str2);
                        } else {
                            str2 = null;
                        }
                        GraphQLXWA2NewsletterRole graphQLXWA2NewsletterRole = (GraphQLXWA2NewsletterRole) a8k4.A0D(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
                        if (graphQLXWA2NewsletterRole != null) {
                            str3 = graphQLXWA2NewsletterRole.name();
                        } else {
                            str3 = null;
                        }
                        A0E.add(new C87104Uh(l2, str2, str3, optDouble));
                    }
                    list = C98924rw.A00(A0E, 9);
                    if (list != null) {
                        linkedHashMap.put(obj2, new AnonymousClass4UM(Long.valueOf(C17900vP.A01(Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue())))), str, list));
                    }
                }
                list = C18460wS.A00;
                linkedHashMap.put(obj2, new AnonymousClass4UM(Long.valueOf(C17900vP.A01(Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue())))), str, list));
            }
            AnonymousClass4QY r0 = this.A00;
            if (r0 != null) {
                AnonymousClass3VG r3 = r0.A00;
                Iterator A15 = AnonymousClass000.A15(linkedHashMap);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    AnonymousClass3VG.A03(r3, (C87234Uu) A16.getKey(), (AnonymousClass4UM) A16.getValue());
                }
                AnonymousClass3VG.A00(r3);
            }
        }
    }

    public boolean A04(A6Z a6z) {
        AnonymousClass4QY r0;
        C18070vi.A0d(a6z, 0);
        if (!this.A01 && (r0 = this.A00) != null) {
            C181499Qs.A00(a6z);
            r0.A00();
        }
        return false;
    }

    public AnonymousClass5WY A00() {
        Set set = this.A01;
        ArrayList A0D2 = C29351c6.A0D(set);
        int i = 0;
        for (Object next : set) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            C87234Uu r6 = (C87234Uu) next;
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            C162478Kx.A01(graphQlCallInput.A02(), Integer.valueOf(i + 1), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            graphQlCallInput.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r6.A02);
            C189819ju r2 = GraphQlCallInput.A02;
            Integer valueOf = Integer.valueOf(r6.A00);
            C162478Kx A002 = r2.A00();
            C162478Kx.A01(A002, valueOf, "number_of_days");
            if (r6.A03) {
                C162478Kx.A01(A002, true, "country");
            }
            if (r6.A04) {
                C162478Kx.A01(A002, true, "role");
            }
            graphQlCallInput.A02().A06(A002, "group_by");
            Integer num = r6.A01;
            if (num != null) {
                C162478Kx.A01(graphQlCallInput.A02(), num, "limit");
            }
            A0D2.add(graphQlCallInput);
            i = i2;
        }
        GraphQlCallInput graphQlCallInput2 = new GraphQlCallInput();
        graphQlCallInput2.A05("newsletter_id", this.A02.getRawString());
        graphQlCallInput2.A06("metrics", A0D2);
        A7K a7k = new A7K();
        a7k.A04(graphQlCallInput2, "input");
        return new AIj(a7k, NewsletterInsightsResponseImpl.class, "NewsletterInsights");
    }

    public boolean A03() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C821643h(AnonymousClass1PY r1, C29681ch r2, AnonymousClass5Y9 r3, AnonymousClass4QY r4, AnonymousClass10I r5, Set set) {
        super(r1, r3, r5);
        C18070vi.A0o(r5, r1, r3);
        this.A02 = r2;
        this.A01 = set;
        this.A00 = r4;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
