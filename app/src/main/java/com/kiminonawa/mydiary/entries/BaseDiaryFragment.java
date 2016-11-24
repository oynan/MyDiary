package com.kiminonawa.mydiary.entries;


import android.support.v4.app.Fragment;


public class BaseDiaryFragment extends Fragment {


    public long getTopicId() {
        return ((DiaryActivity) getActivity()).getTopicId();
    }

    public void setIsEditing(boolean isEditing){
        ((DiaryActivity) getActivity()).setEditing(isEditing);
    }
}

