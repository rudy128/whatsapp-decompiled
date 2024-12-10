package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass4SF;
import X.AnonymousClass4TF;
import X.C17880vN;
import X.C18070vi;
import X.C200610r;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C32101gd;
import X.C63312sr;
import X.C63872tp;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$refreshCommunityMembers$1", f = "CommunityMembersViewModel.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$refreshCommunityMembers$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$refreshCommunityMembers$1(CommunityMembersViewModel communityMembersViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = communityMembersViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMembersViewModel$refreshCommunityMembers$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMembersViewModel$refreshCommunityMembers$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        CommunityMembersViewModel communityMembersViewModel;
        Object value;
        AnonymousClass1EC r8;
        LinkedHashMap linkedHashMap;
        Object value2;
        Object obj2;
        Object value3;
        Integer num;
        String str;
        int i;
        int i2;
        Object obj3 = obj;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            C30691eM.A01(obj3);
            communityMembersViewModel = this.this$0;
            C32101gd r1 = communityMembersViewModel.A08;
            AnonymousClass1EC r0 = communityMembersViewModel.A0I;
            this.L$0 = communityMembersViewModel;
            this.label = 1;
            obj3 = r1.BOz(r0, this);
            if (obj3 == r3) {
                return r3;
            }
        } else if (i3 == 1) {
            communityMembersViewModel = (CommunityMembersViewModel) this.L$0;
            C30691eM.A01(obj3);
        } else {
            throw AnonymousClass000.A0l();
        }
        Map map = (Map) obj3;
        AnonymousClass1G4 r11 = communityMembersViewModel.A0K;
        do {
            value = r11.getValue();
            Map map2 = (Map) value;
            C32101gd r02 = communityMembersViewModel.A08;
            r8 = communityMembersViewModel.A0I;
            Collection<C63312sr> values = map.values();
            CommunityMembersDirectory communityMembersDirectory = (CommunityMembersDirectory) r02;
            C18070vi.A0d(values, 1);
            LinkedHashMap A13 = C17880vN.A13();
            AnonymousClass1EC A00 = CommunityMembersDirectory.A00(communityMembersDirectory, r8);
            if (A00 != null) {
                C63872tp A0B = communityMembersDirectory.A06.A08.A0B(A00);
                for (C63312sr r03 : values) {
                    UserJid userJid = r03.A04;
                    C63312sr A0D = A0B.A0D(userJid, false);
                    if (A0D != null) {
                        C17880vN.A1P(userJid, A13, A0D.A01);
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(C200610r.A03(map.size()));
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                AnonymousClass1E7 A0E = communityMembersViewModel.A0B.A0E((AnonymousClass1BI) A16.getKey());
                if (communityMembersViewModel.A07.A0O((AnonymousClass1BI) A16.getKey())) {
                    str = communityMembersViewModel.A06.A00();
                } else if (A0E == null || (str = A0E.A0Z) == null) {
                    str = "";
                }
                Number number = (Number) A13.get(A16.getKey());
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = -1;
                }
                AnonymousClass4SF r04 = (AnonymousClass4SF) map2.get(A16.getKey());
                if (r04 != null) {
                    i2 = r04.A01;
                } else {
                    i2 = 0;
                }
                linkedHashMap.put(key, new AnonymousClass4SF(A0E, (PhoneUserJid) A16.getKey(), str, ((C63312sr) A16.getValue()).A01, i, i2));
            }
        } while (!r11.BFK(value, linkedHashMap));
        AnonymousClass1G4 r32 = communityMembersViewModel.A0M;
        do {
            value2 = r32.getValue();
            PhoneUserJid A002 = AnonymousClass11S.A00(communityMembersViewModel.A07);
            if (A002 != null) {
                obj2 = ((Map) r11.getValue()).get(A002);
            } else {
                obj2 = null;
            }
        } while (!r32.BFK(value2, obj2));
        AnonymousClass1G4 r33 = communityMembersViewModel.A0L;
        do {
            value3 = r33.getValue();
            if (communityMembersViewModel.A0D.A0K(r8)) {
                num = Integer.valueOf(((Map) r11.getValue()).size());
            } else {
                num = null;
            }
        } while (!r33.BFK(value3, new AnonymousClass4TF(1, num)));
        return C27621Wu.A00;
    }
}
