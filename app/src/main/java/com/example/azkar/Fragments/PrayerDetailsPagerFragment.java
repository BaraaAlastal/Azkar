package com.example.azkar.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.azkar.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PrayerDetailsPagerFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PrayerDetailsPagerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PrayerDetailsPagerFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String tv_icon = "3";
    private static final String tv_3times = "threeTimes";
    private static final String tv_bigText = "bigText";
    private static final String tv_srcText = "sourceText";
    private static final String like_icon = "image";
    private static final String tv_add2Fav = "add2fav";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;
    private String mParam4;
    private int mParam5;
    private String mParam6;

    private OnFragmentInteractionListener mListener;

    public PrayerDetailsPagerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PrayerDetailsPagerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PrayerDetailsPagerFragment newInstance(String param1, String param2, String param3, String param4
            , int param5, String param6) {
        PrayerDetailsPagerFragment fragment = new PrayerDetailsPagerFragment();
        Bundle args = new Bundle();
        args.putString(tv_icon, param1);
        args.putString(tv_3times, param2);
        args.putString(tv_bigText, param3);
        args.putString(tv_srcText, param4);
        args.putInt(like_icon, param5);
        args.putString(tv_add2Fav, param6);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(tv_icon);
            mParam2 = getArguments().getString(tv_3times);
            mParam3 = getArguments().getString(tv_bigText);
            mParam4 = getArguments().getString(tv_srcText);
            mParam5 = getArguments().getInt(like_icon);
            mParam6 = getArguments().getString(tv_add2Fav);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prayer_details_pager, container, false);
        TextView tv1 = view.findViewById(R.id.tv_red_icon);
        TextView tv2 = view.findViewById(R.id.tv_3times);
        TextView tv3 = view.findViewById(R.id.tv_big_text);
        TextView tv4 = view.findViewById(R.id.tv_src_text);
        ImageView img = view.findViewById(R.id.like_icon);
        TextView tv5 = view.findViewById(R.id.tv_add2Fav);

        tv1.setText(mParam1);
        tv2.setText(mParam2);
        tv3.setText(mParam3);
        tv4.setText(mParam4);
        if(mParam5==0){
            img.setImageResource(R.drawable.like_grey);
        }

//        img.setImageResource(Integer.parseInt(mParam5));
        tv5.setText(mParam6);
        return view;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
