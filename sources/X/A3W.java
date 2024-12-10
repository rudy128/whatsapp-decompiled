package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class A3W {
    public static UserJid A00(AnonymousClass11S r2, AnonymousClass1CJ r3, AnonymousClass1BI r4, boolean z) {
        if ((!(r4 instanceof GroupJid) || (r3.A06((GroupJid) r4) != 3 && !z)) && !C22971Dz.A0T(r4)) {
            return AnonymousClass11S.A01(r2);
        }
        return r2.A0A();
    }

    public static C183509Yn A01(AnonymousClass8XH r5, List list, int i) {
        StringBuilder sb;
        String obj;
        HashSet A12 = C17880vN.A12();
        EE9<DSQ> ee9 = r5.selectedOptions_;
        if (ee9 != null) {
            if (ee9.size() > list.size() || (i > 0 && ee9.size() > i)) {
                sb = AnonymousClass000.A10();
                C17890vO.A15("MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_invalid_options_count selectedOptionsSize=", sb, ee9);
                C17890vO.A15(" pollOptionsSize=", sb, list);
                sb.append(" selectableOptionCount=");
                sb.append(i);
            } else {
                for (DSQ A06 : ee9) {
                    byte[] A062 = A06.A06();
                    int length = A062.length;
                    if (length != 32) {
                        sb = AnonymousClass000.A10();
                        sb.append("MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_invalid_option optionLength=");
                        sb.append(length);
                    } else {
                        A12.add(C108955ca.A14(A062));
                    }
                }
                ArrayList A02 = A02(list, A12);
                if (A02.size() == A12.size()) {
                    return new C183509Yn(A02);
                }
                obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload poll_vote_option_not_found pollVoteSelectedOptionSha256Strings is not same size as pollVoteSelectedOptionIds";
            }
            obj = sb.toString();
            break;
        }
        obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload selectedOptionsSha256ByteArrays is null";
        Log.e(obj);
        return null;
    }

    public static ArrayList A02(List list, Set set) {
        if (set.isEmpty()) {
            return AnonymousClass000.A13();
        }
        HashSet A12 = C17880vN.A12();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A18 a18 = (A18) it.next();
            if (set.contains(a18.A02)) {
                long j = a18.A01;
                if (j != -1) {
                    C17880vN.A1R(A12, j);
                }
            }
        }
        return C17880vN.A10(A12);
    }
}
