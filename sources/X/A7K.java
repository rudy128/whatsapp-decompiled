package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.jid.Jid;

public class A7K {
    public final AnonymousClass29S A00 = new GraphQlCallInput();

    public static A7K A00() {
        return new A7K();
    }

    public static A7K A01(GraphQlCallInput graphQlCallInput) {
        A7K a7k = new A7K();
        a7k.A04(graphQlCallInput, "input");
        return a7k;
    }

    public static void A02(A7K a7k, Boolean bool, Boolean bool2) {
        a7k.A06("fetch_image", bool);
        a7k.A06("fetch_preview", bool2);
        a7k.A06("fetch_description", bool2);
        a7k.A06("fetch_invite", bool2);
        a7k.A06("fetch_handle", bool2);
        a7k.A06("fetch_subscribers_count", bool2);
        a7k.A06("fetch_verification", bool2);
        a7k.A06("fetch_viewer_metadata", bool);
    }

    public void A04(GraphQlCallInput graphQlCallInput, String str) {
        this.A00.A02().A06(graphQlCallInput.A02(), str);
    }

    public void A05(Number number, String str) {
        if (number != null) {
            C162478Kx.A01(this.A00.A02(), number, str);
        }
    }

    public void A06(String str, Boolean bool) {
        if (bool != null) {
            C162478Kx.A01(this.A00.A02(), bool, str);
        }
    }

    public void A07(String str, String str2) {
        if (str2 != null) {
            this.A00.A05(str, str2);
        }
    }

    public static boolean A03(A7K a7k, Jid jid) {
        String rawString = jid.getRawString();
        a7k.A07("newsletter_id", rawString);
        if (rawString != null) {
            return true;
        }
        return false;
    }
}
