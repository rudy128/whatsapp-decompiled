package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1j1  reason: invalid class name and case insensitive filesystem */
public final class C33561j1 implements AnonymousClass1RJ {
    public final C33551j0 A00;
    public final C33451iq A01;

    public C33561j1(C33551j0 r2, C33451iq r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public int[] BSG() {
        return new int[]{216};
    }

    public boolean BcT(Message message, int i) {
        String str;
        int i2;
        int i3;
        StringBuilder sb;
        String obj;
        Message message2 = message;
        C18070vi.A0d(message2, 1);
        if (i != 216) {
            return false;
        }
        List<C63592tN> list = (List) message2.obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C63592tN r2 : list) {
                int i4 = r2.A02;
                if (i4 == 2 || i4 == 1) {
                    arrayList.add(r2);
                } else if (i4 == 0) {
                    arrayList2.add(r2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.size();
                C33451iq r3 = this.A01;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UserNoticeManager/onUserNoticeListReceived/serverUserNoticeList size: ");
                sb2.append(arrayList2.size());
                Log.i(sb2.toString());
                C33431io r22 = r3.A03;
                TreeMap A012 = r22.A01();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C63592tN r11 = (C63592tN) it.next();
                    C63592tN r15 = (C63592tN) A012.get(Integer.valueOf(r11.A01));
                    if (r15 == null) {
                        obj = "UserNoticeManager/getUpdatedUserNoticeList/new notice";
                    } else {
                        int i5 = r15.A00;
                        int i6 = r11.A00;
                        if (i5 < i6) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("UserNoticeManager/getUpdatedUserNoticeList/client stage is stale. client stage: ");
                            sb3.append(i5);
                            sb3.append(" sever stage: ");
                            sb3.append(i6);
                            obj = sb3.toString();
                        } else {
                            int i7 = r15.A03;
                            int i8 = r11.A03;
                            if (i7 < i8) {
                                sb.append("UserNoticeManager/getUpdatedUserNoticeList/new version available. client version: ");
                                sb.append(i7);
                                sb.append(" sever version: ");
                                sb.append(i8);
                                Log.i(sb.toString());
                                r15 = new C63592tN(r15.A01, r15.A00, i8, r15.A04, 0);
                            } else {
                                sb = new StringBuilder();
                                sb.append("UserNoticeManager/getUpdatedUserNoticeList/server stage is same or stale. client stage: ");
                                sb.append(i5);
                                sb.append(" sever stage: ");
                                sb.append(i6);
                                Log.i(sb.toString());
                            }
                            arrayList3.add(r15);
                        }
                    }
                    Log.i(obj);
                    arrayList3.add(r11);
                }
                r22.A03(arrayList3);
                C63592tN A002 = r22.A00();
                TreeMap A013 = r22.A01();
                if (A013.isEmpty()) {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/notice map empty");
                } else {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/found metadata");
                    Map.Entry firstEntry = A013.firstEntry();
                    if (firstEntry != null) {
                        C63592tN r7 = (C63592tN) firstEntry.getValue();
                        if (r7 != null) {
                            r22.A02(r7);
                            if (A002 != null && ((i2 = A002.A01) != (i3 = r7.A01) || A002.A03 < r7.A03)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("UserNoticeManager/deleteUserNoticeContentIfNecessary/notice mismatch: ");
                                boolean z = true;
                                boolean z2 = false;
                                if (i2 != i3) {
                                    z2 = true;
                                }
                                sb4.append(z2);
                                sb4.append(" old version: ");
                                if (A002.A03 >= r7.A03) {
                                    z = false;
                                }
                                sb4.append(z);
                                Log.i(sb4.toString());
                                r3.A02.A05(i2);
                            }
                            C33421in r8 = r3.A02;
                            int i9 = r7.A03;
                            int i10 = r7.A01;
                            int i11 = r7.A00;
                            int i12 = 0;
                            if (i11 != 0) {
                                i12 = 1;
                                if (i11 != 1) {
                                    i12 = 2;
                                    if (i11 != 2) {
                                        i12 = 3;
                                        if (i11 != 3) {
                                            i12 = 4;
                                            if (i11 != 4) {
                                                i12 = 5;
                                                if (i11 != 5) {
                                                    i12 = -1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/notice id ");
                            sb5.append(i10);
                            sb5.append(" version: ");
                            sb5.append(i9);
                            sb5.append(" stage: ");
                            sb5.append(i12);
                            Log.i(sb5.toString());
                            if (i12 == 5) {
                                str = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/end stage, skip fetch";
                            } else {
                                C18030ve r1 = r8.A04;
                                if (C63802ti.A01(r1, i10)) {
                                    str = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/green alert disabled";
                                } else {
                                    if (!C63802ti.A02(r1, r7)) {
                                        if (!C33421in.A03(r8, new String[]{"content.json"}, i10)) {
                                            Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/content does not exist, fetch");
                                            r8.A06(i10);
                                        }
                                    }
                                    C33451iq.A02(r8.A04(r7), r3, r7);
                                }
                            }
                            Log.i(str);
                            C33451iq.A02(r8.A04(r7), r3, r7);
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                r3.A0A();
                C33451iq.A04(r3);
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                C33551j0 r72 = this.A00;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C63592tN r23 = (C63592tN) it2.next();
                    Integer valueOf = Integer.valueOf(r23.A02);
                    List list2 = (List) hashMap.get(valueOf);
                    if (list2 == null) {
                        hashMap.put(valueOf, AnonymousClass1ZU.A06(r23));
                    } else {
                        list2.add(r23);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    List list3 = (List) entry.getValue();
                    list3.size();
                    if (list3.size() > 0) {
                        r72.A01.execute(new C70863Cu(r72, intValue, 32, list3));
                    }
                }
            }
        }
        return true;
    }
}
