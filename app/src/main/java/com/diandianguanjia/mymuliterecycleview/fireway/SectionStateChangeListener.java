package com.diandianguanjia.mymuliterecycleview.fireway;

/**
 * Created by bpncool on 2/24/2016.
 */

import com.diandianguanjia.mymuliterecycleview.fireway.Section;

/**
 * interface to listen changes in state of sections
 */
public interface SectionStateChangeListener {
    void onSectionStateChanged(Section section, boolean isOpen);
}