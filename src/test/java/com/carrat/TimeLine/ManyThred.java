package com.carrat.TimeLine;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

public class ManyThred {

	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < 100000; i++) {
				list.add(i + ",");
			}
			long startime = System.currentTimeMillis();
			System.out.println("开始时间："+ startime);
			System.out.println(list2Str(list, 2));   //
			//System.out.println(listfor(list)); // 1073  954 903  1019
			long endtime = System.currentTimeMillis();
			System.out.println("结束时间："+ endtime);
			System.out.println("耗费时长："+ (endtime-startime));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String listfor(List<String> list) {
		StringBuffer ret = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			ret = ret.append(string);
			System.out.println(string);
		}
		return ret.toString();
	}

	public static String list2Str(List<String> list, final int nThreads) throws Exception {
		if (list == null || list.isEmpty()) {
			return null;
		}
		StringBuffer ret = new StringBuffer();

		int size = list.size();
		ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
		List<Future<String>> futures = new ArrayList<Future<String>>(nThreads);
		for (int i = 0; i < nThreads; i++) {
			final List<String> subList = list.subList(size / nThreads * i, size / nThreads * (i + 1));
			Callable task = new Callable() {
				public String call() throws Exception {
					StringBuffer sb = new StringBuffer();
					for (String str : subList) {
						sb.append(str);
						System.out.println(str);//
					}
					return sb.toString();
				}
			};
			futures.add(executorService.submit(task));
		}

		for (Future<String> future : futures) {
			ret.append(future.get());
		}
		executorService.shutdown();

		return ret.toString();
	}

}