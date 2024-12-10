package X;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.1ay  reason: invalid class name and case insensitive filesystem */
public final class C28831ay extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ List $delimitersList;
    public final /* synthetic */ boolean $ignoreCase = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28831ay(List list) {
        super(2);
        this.$delimitersList = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        Integer valueOf;
        boolean regionMatches;
        String str;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        C18070vi.A0d(charSequence, 0);
        List list = this.$delimitersList;
        boolean z = this.$ignoreCase;
        if (z || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            C25411Oc r1 = new C25411Oc(intValue, charSequence.length());
            boolean z2 = charSequence instanceof String;
            int i = r1.A00;
            int i2 = r1.A01;
            int i3 = r1.A02;
            if (z2) {
                if (i3 > 0) {
                    if (i > i2) {
                        return null;
                    }
                } else if (i3 >= 0 || i2 > i) {
                    return null;
                }
                while (true) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        String str2 = (String) next;
                        String str3 = (String) charSequence;
                        int length = str2.length();
                        C18070vi.A0d(str3, 2);
                        if (!z) {
                            regionMatches = str2.regionMatches(0, str3, i, length);
                            continue;
                        } else {
                            regionMatches = str2.regionMatches(z, 0, str3, i, length);
                            continue;
                        }
                        if (regionMatches) {
                            if (next != null) {
                                obj3 = next;
                                break;
                            }
                        }
                    }
                    if (i == i2) {
                        return null;
                    }
                    i += i3;
                }
            } else {
                if (i3 > 0) {
                    if (i > i2) {
                        return null;
                    }
                } else if (i3 >= 0 || i2 > i) {
                    return null;
                }
                while (true) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        String str4 = (String) next2;
                        if (AnonymousClass1YF.A0X(str4, charSequence, 0, i, str4.length(), z)) {
                            if (next2 != null) {
                                obj3 = next2;
                                break;
                            }
                        }
                    }
                    if (i == i2) {
                        return null;
                    }
                    i += i3;
                }
            }
            valueOf = Integer.valueOf(i);
            str = obj3;
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            } else if (size == 1) {
                String str5 = (String) list.get(0);
                int A0F = AnonymousClass1YF.A0F(charSequence, str5, intValue, false);
                if (A0F < 0) {
                    return null;
                }
                valueOf = Integer.valueOf(A0F);
                str = str5;
            } else {
                throw new IllegalArgumentException("List has more than one element.");
            }
        }
        AnonymousClass1D6 r0 = new AnonymousClass1D6(valueOf, str);
        return new AnonymousClass1D6(r0.first, Integer.valueOf(((String) r0.second).length()));
    }
}
