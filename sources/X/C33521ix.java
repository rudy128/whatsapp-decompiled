package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1ix  reason: invalid class name and case insensitive filesystem */
public final class C33521ix implements C33511iw {
    public final C33501iv A00;
    public final C33461ir A01;
    public final AnonymousClass00H A02;
    public final C33481it A03;
    public volatile boolean A04;

    public C33521ix(C33501iv r2, C33461ir r3, C33481it r4, AnonymousClass00H r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r2, 4);
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A00 = r2;
    }

    public void BcD(String str, JSONObject jSONObject, int[] iArr) {
        int i;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("results");
            C18070vi.A0X(jSONArray);
            int[] iArr2 = iArr;
            int length = iArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    C18070vi.A0X(jSONObject2);
                    i = jSONObject2.getInt("notice_id");
                    int[] copyOf = Arrays.copyOf(iArr2, length);
                    C18070vi.A0X(copyOf);
                    int length2 = copyOf.length;
                    if (length2 != 0) {
                        copyOf = Arrays.copyOf(copyOf, length2);
                        C18070vi.A0X(copyOf);
                        if (copyOf.length > 1) {
                            Arrays.sort(copyOf);
                        }
                    }
                    int binarySearch = Arrays.binarySearch(copyOf, i);
                    if (binarySearch >= 0 && binarySearch < length && i == iArr[binarySearch]) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("privacy-disclosure");
                        C18070vi.A0X(jSONObject3);
                        String string = jSONObject3.getString("deeplink");
                        C18070vi.A0X(string);
                        C33461ir r9 = this.A01;
                        r9.A04((Integer) null, string, jSONObject2.toString(), str, i, 1, -1, false);
                        C33461ir.A01(r9);
                        ConcurrentHashMap concurrentHashMap = r9.A04;
                        Integer valueOf = Integer.valueOf(i);
                        C39551tG r0 = (C39551tG) concurrentHashMap.get(valueOf);
                        if (r0 != null && r0.A01 <= 1) {
                            AnonymousClass00H r11 = this.A02;
                            C138126wZ r10 = C138126wZ.A06;
                            ((C25768Clf) r11.get()).A03(r10, i, 1, 1);
                            C33501iv r92 = this.A00;
                            ConcurrentHashMap concurrentHashMap2 = r92.A0A;
                            if (concurrentHashMap2.get(valueOf) != null) {
                                concurrentHashMap2.get(valueOf);
                            } else {
                                r92.A04.A00(i, 1, false);
                            }
                            r92.A03(i, 100, false, false);
                            ((C25768Clf) r11.get()).A03(r10, i, 100, 1);
                        }
                    }
                } catch (JSONException e) {
                    ((C25768Clf) this.A02.get()).A02(i, 3);
                    throw e;
                } catch (JSONException e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PdfnDisclosureHandler/handleDisclosureContent wrong json object for disclosure ");
                    sb.append(e2);
                    Log.e(sb.toString());
                }
            }
        } catch (JSONException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PdfnDisclosureHandler/handleDisclosureContent wrong json object for disclosure ");
            sb2.append(e3);
            Log.e(sb2.toString());
        }
    }

    public void BcE(List list, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!this.A04) {
            this.A04 = true;
            this.A01.A00 = this.A00;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63592tN r8 = (C63592tN) it.next();
            int i = r8.A01;
            Integer valueOf = Integer.valueOf(i);
            arrayList2.add(valueOf);
            int i2 = r8.A03;
            C33461ir r10 = this.A01;
            C33461ir.A01(r10);
            C39551tG r0 = (C39551tG) r10.A04.get(valueOf);
            if (r0 == null) {
                if (!C39751ta.A01.contains(Integer.valueOf(r8.A00))) {
                    arrayList.add(valueOf);
                }
                r10.A03(i, r8.A00, r8.A02, i2, z2 ? 1 : 0);
            } else {
                int i3 = r0.A03;
                if (i3 != i2) {
                    arrayList.add(valueOf);
                }
                int i4 = r0.A01;
                int i5 = r8.A00;
                if (i4 != i5 || i3 != i2) {
                    r10.A04(Integer.valueOf(i2), (String) null, (String) null, "", i, i5, -1, true);
                }
            }
        }
        C33461ir r6 = this.A01;
        ArrayList arrayList3 = new ArrayList();
        ConcurrentHashMap concurrentHashMap = r6.A04;
        for (Object next : concurrentHashMap.keySet()) {
            C18070vi.A0b(next);
            C39551tG r02 = (C39551tG) concurrentHashMap.get(next);
            if ((r02 == null || r02.A00 != 1) && !arrayList2.contains(next)) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            C39551tG r03 = (C39551tG) concurrentHashMap.get(number);
            if (r03 != null) {
                if (!C39751ta.A01.contains(Integer.valueOf(r03.A01))) {
                    C18070vi.A0b(number);
                    int intValue = number.intValue();
                    C33461ir.A01(r6);
                    if (concurrentHashMap.get(number) != null) {
                        concurrentHashMap.remove(number);
                        ((SharedPreferences) r6.A05.getValue()).edit().remove(String.valueOf(intValue)).apply();
                    }
                    SharedPreferences.Editor A002 = C33461ir.A00(r6);
                    StringBuilder sb = new StringBuilder();
                    sb.append("repeat_last_index_");
                    sb.append(intValue);
                    SharedPreferences.Editor putInt = A002.putInt(sb.toString(), -1);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("repeat_last_ts_");
                    sb2.append(intValue);
                    putInt.putLong(sb2.toString(), 0).apply();
                    C33501iv r04 = r6.A00;
                    if (r04 != null) {
                        File file = new File(new File(((C56962iJ) r04.A07.get()).A00.A00.getFilesDir(), "privacy_disclosure"), String.valueOf(intValue));
                        if (!file.exists()) {
                            Log.e("PrivacyDisclosureFileCache/getPrivacyDisclosureDir can not make directory");
                        } else {
                            C64062u9.A0R(file);
                        }
                    }
                }
            }
        }
        if (z && (!arrayList.isEmpty())) {
            this.A03.A01(arrayList, 1200000, false);
        }
    }

    public void Brk(int[] iArr, int i) {
        Object obj;
        C33501iv r2 = this.A00;
        if (i == 430) {
            Log.e("PrivacyDisclosureDataManager/ondisclosurefetchingerror no eligible disclosure");
            obj = r2.A09;
            synchronized (obj) {
                if (r2.A0H && iArr.length != 0 && iArr[0] == r2.A0F) {
                    r2.A0H = false;
                    r2.A0F = 0;
                }
            }
        } else if (i == 400 || i == 410) {
            Log.e("PrivacyDisclosureDataManager/ondisclosurefetchingerror fail dl or parse case");
            obj = r2.A08;
            synchronized (obj) {
                if (r2.A0G && iArr.length != 0 && iArr[0] == r2.A0E) {
                    r2.A0G = false;
                    r2.A0E = 0;
                }
            }
        } else {
            return;
        }
        obj.notify();
    }
}
