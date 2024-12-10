package org.chromium.support_lib_boundary;

import java.util.Map;
import java.util.Set;

public interface WebSettingsBoundaryInterface {
    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    Set getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    Map getUserAgentMetadataMap();

    int getWebAuthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z);

    void setAttributionBehavior(int i);

    void setDisabledActionModeMenuItems(int i);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setOffscreenPreRaster(boolean z);

    void setRequestedWithHeaderOriginAllowList(Set set);

    void setSafeBrowsingEnabled(boolean z);

    void setUserAgentMetadataFromMap(Map map);

    void setWebAuthnSupport(int i);

    void setWillSuppressErrorPage(boolean z);
}
