package com.whatsapp.lists;

import X.AnonymousClass00H;
import X.AnonymousClass0DT;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1NA;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C28791au;
import X.C28801av;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C38501rO;
import X.C41691wu;
import X.C41761x1;
import X.C41841x9;
import X.C41851xA;
import X.C448825d;
import X.C62522rX;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.lists.ListsRepository$getListsIncludingHidden$2", f = "ListsRepository.kt", i = {0}, l = {194}, m = "invokeSuspend", n = {"labels"}, s = {"L$0"})
public final class ListsRepository$getListsIncludingHidden$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ListsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListsRepository$getListsIncludingHidden$2(ListsRepository listsRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = listsRepository;
    }

    public static final String A00(Collection collection) {
        String str;
        C18070vi.A0d(collection, 0);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int i = ((C41761x1) it.next()).A02;
            if (i == 0) {
                str = "custom";
            } else if (i == 1) {
                str = "unread";
            } else if (i == 2) {
                str = "contacts";
            } else if (i == 3) {
                str = "groups";
            } else if (i != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("unknown ");
                sb.append(i);
                str = sb.toString();
            } else {
                str = "favorites";
            }
            arrayList.add(str);
        }
        return arrayList.toString();
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ListsRepository$getListsIncludingHidden$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ListsRepository$getListsIncludingHidden$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        C41851xA BD0;
        C31751g4 r14 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ListsRepository listsRepository = this.this$0;
            AnonymousClass1NA r1 = (AnonymousClass1NA) listsRepository.A02.get();
            if (!listsRepository.A0F) {
                AnonymousClass00H r5 = listsRepository.A08;
                boolean z = true;
                if (!((C38501rO) r5.get()).A07()) {
                    z = false;
                }
                if (z && ((C38501rO) r5.get()).A07()) {
                    synchronized (listsRepository) {
                        if (!listsRepository.A0F) {
                            C41691wu r7 = (C41691wu) listsRepository.A09.get();
                            ArrayList A08 = r1.A08();
                            LinkedHashSet A05 = C41841x9.A05(0, C29431cG.A12(r7.A01()));
                            ArrayList<C41761x1> arrayList3 = new ArrayList<>();
                            Iterator it2 = A08.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (!A05.contains(Integer.valueOf(((C41761x1) next).A02))) {
                                    arrayList3.add(next);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(C29351c6.A0C(arrayList3, 10));
                            for (C41761x1 r4 : arrayList3) {
                                arrayList4.add(Long.valueOf(r4.A03));
                            }
                            r1.A0C(C29431cG.A1C(arrayList4));
                            A08.removeAll(arrayList3);
                            StringBuilder sb = new StringBuilder();
                            sb.append("ListsRepository/storeStaticListsIfNeeded/deleted ");
                            sb.append(A00(arrayList3));
                            Log.i(sb.toString());
                            List A01 = r7.A01();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = A08.iterator();
                            while (it3.hasNext()) {
                                linkedHashSet.add(Integer.valueOf(((C41761x1) it3.next()).A02));
                            }
                            ArrayList<Number> arrayList5 = new ArrayList<>();
                            for (Object next2 : A01) {
                                if (!linkedHashSet.contains(Integer.valueOf(((Number) next2).intValue()))) {
                                    arrayList5.add(next2);
                                }
                            }
                            ArrayList<C41761x1> arrayList6 = new ArrayList<>(C29351c6.A0C(arrayList5, 10));
                            for (Number intValue : arrayList5) {
                                int intValue2 = intValue.intValue();
                                arrayList6.add(new C41761x1(C41691wu.A00(r7, intValue2), intValue2, 0, -1, -1, 0, 0, false));
                            }
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                C28791au A052 = r1.A03.A05();
                                try {
                                    BD0 = A052.BD0();
                                    for (C41761x1 r11 : arrayList6) {
                                        ContentValues contentValues = new ContentValues(3);
                                        int i2 = r11.A02;
                                        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, Integer.valueOf(i2));
                                        String str = r11.A06;
                                        contentValues.put("label_name", str);
                                        long j = r11.A04;
                                        contentValues.put("predefined_id", Long.valueOf(j));
                                        int i3 = r11.A01;
                                        contentValues.put("color_id", Integer.valueOf(i3));
                                        boolean z2 = r11.A07;
                                        contentValues.put("hidden", Integer.valueOf(z2 ? 1 : 0));
                                        long A053 = ((C28801av) A052).A02.A05("labels", "insertLabels/INSERT_LABELS", contentValues);
                                        AnonymousClass1NA.A04(A052, "insertLabels/UPDATE_SORT_ID", A053, A053);
                                        arrayList7.add(new C41761x1(str, i2, i3, 0, A053, j, A053, z2));
                                    }
                                    BD0.A00();
                                    A052.BJ7(new C448825d(r1, arrayList7, 7));
                                    BD0.close();
                                    A052.close();
                                    Set A12 = C29431cG.A12(r7.A01());
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it4 = A08.iterator();
                                    while (it4.hasNext()) {
                                        C41761x1 r10 = (C41761x1) it4.next();
                                        int i4 = r10.A02;
                                        if (A12.contains(Integer.valueOf(i4))) {
                                            String str2 = r10.A06;
                                            String A00 = C41691wu.A00(r7, i4);
                                            if (!C18070vi.A18(str2, A00)) {
                                                long j2 = r10.A03;
                                                long j3 = r10.A04;
                                                String str3 = A00;
                                                arrayList8.add(new AnonymousClass1D6(r10, new C41761x1(str3, i4, r10.A01, r10.A00, j2, j3, r10.A05, r10.A07)));
                                            }
                                        }
                                    }
                                    Map A0D = AnonymousClass1D7.A0D(arrayList8);
                                    for (Map.Entry value : A0D.entrySet()) {
                                        C41761x1 r52 = (C41761x1) value.getValue();
                                        long j4 = r52.A03;
                                        String str4 = r52.A06;
                                        ((C62522rX) listsRepository.A03.get()).A02(str4, j4, r52.A04);
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("ListsRepository/storeStaticListsIfNeeded/renamed ");
                                    sb2.append(A00(A0D.values()));
                                    Log.i(sb2.toString());
                                    ArrayList arrayList9 = new ArrayList(C29351c6.A0C(A08, 10));
                                    Iterator it5 = A08.iterator();
                                    while (it5.hasNext()) {
                                        C41761x1 r53 = (C41761x1) it5.next();
                                        C41761x1 r42 = (C41761x1) A0D.get(r53);
                                        if (r42 != null) {
                                            r53 = r42;
                                        }
                                        arrayList9.add(r53);
                                    }
                                    ArrayList A0k = C29431cG.A0k(arrayList9, arrayList7);
                                    ArrayList arrayList10 = new ArrayList(C29351c6.A0C(A0k, 10));
                                    Iterator it6 = A0k.iterator();
                                    while (it6.hasNext()) {
                                        arrayList10.add(Long.valueOf(((C41761x1) it6.next()).A03));
                                    }
                                    r1.A0A(arrayList10);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("ListsRepository/storeStaticListsIfNeeded/inserted ");
                                    sb3.append(A00(arrayList7));
                                    Log.i(sb3.toString());
                                    listsRepository.A0F = true;
                                    arrayList2 = A0k;
                                } catch (Throwable th) {
                                    A052.close();
                                    throw th;
                                }
                            } catch (SQLiteDatabaseCorruptException e) {
                                Log.e((Throwable) e);
                                r1.A02.A03();
                            } catch (Throwable th2) {
                                AnonymousClass0DT.A00(th, th2);
                            }
                        }
                    }
                    it = arrayList2.iterator();
                    arrayList = arrayList2;
                }
            }
            arrayList2 = r1.A08();
            it = arrayList2.iterator();
            arrayList = arrayList2;
        } else if (i == 1) {
            it = (Iterator) this.L$1;
            Object obj2 = this.L$0;
            C30691eM.A01(obj);
            arrayList = obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            ListsRepository listsRepository2 = this.this$0;
            this.L$0 = arrayList;
            this.L$1 = it;
            this.label = 1;
            Object A002 = C30451dy.A00(this, listsRepository2.A0B, new ListsRepository$buildOrRefreshJidsCache$2((C41761x1) it.next(), listsRepository2, (C30391dr) null));
            if (A002 != r14) {
                A002 = C27621Wu.A00;
                continue;
            }
            if (A002 == r14) {
                return r14;
            }
        }
        return arrayList;
        throw th;
    }
}
