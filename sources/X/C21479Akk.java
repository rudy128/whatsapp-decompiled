package X;

import android.accounts.Account;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Akk  reason: case insensitive filesystem */
public class C21479Akk implements Comparator {
    public final int A00;
    public final Object A01;

    public C21479Akk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                A05 a05 = (A05) obj;
                A05 a052 = (A05) obj2;
                boolean z = a05.A01;
                boolean z2 = a052.A01;
                if (z == z2) {
                    return a05.A02 - a052.A02;
                }
                if (z2) {
                    return -1;
                }
                return 1;
            case 2:
                Account account = (Account) obj;
                Account account2 = (Account) obj2;
                Set set = ((RestoreFromBackupActivity) this.A01).A11;
                boolean contains = set.contains(account);
                boolean contains2 = set.contains(account2);
                if (contains != contains2) {
                    return (contains ? 1 : 0) - (contains2 ? 1 : 0);
                }
                return account.name.compareTo(account2.name);
            case 3:
                C20269AEc BXJ = ((AF1) obj).BXJ();
                C20269AEc aEc = (C20269AEc) this.A01;
                return C40151uF.A00(Float.valueOf(C196579vI.A00(BXJ, aEc)), Float.valueOf(C196579vI.A00(((AF1) obj2).BXJ(), aEc)));
            case 4:
                return ((Collator) this.A01).compare(((AEQ) obj).A01, ((AEQ) obj2).A01);
            case 5:
                Map map = (Map) this.A01;
                return C40151uF.A00((Comparable) map.get(obj2), (Comparable) map.get(obj));
            case 8:
            case 9:
                C20284AEs aEs = (C20284AEs) obj2;
                AnonymousClass8pY r0 = (AnonymousClass8pY) ((C20284AEs) obj).A08;
                long j = Long.MAX_VALUE;
                if (r0 != null) {
                    long j2 = r0.A06;
                    if (j2 >= 0) {
                        j = j2;
                    }
                }
                AnonymousClass8pY r02 = (AnonymousClass8pY) aEs.A08;
                long j3 = Long.MAX_VALUE;
                if (r02 != null) {
                    long j4 = r02.A06;
                    if (j4 >= 0) {
                        j3 = j4;
                    }
                }
                return (j > j3 ? 1 : (j == j3 ? 0 : -1));
            case 11:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare == 0) {
                    return C40151uF.A00(Long.valueOf(((C21319Ai4) obj).A04), Long.valueOf(((C21319Ai4) obj2).A04));
                }
                return compare;
            default:
                AnonymousClass1OS r1 = (AnonymousClass1OS) this.A01;
                C18070vi.A0d(r1, 0);
                return AnonymousClass000.A0M(r1.invoke(obj, obj2));
        }
    }
}
