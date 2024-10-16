@param java.util.List<String> projectList

@template.layouts.main(content = @`
    <div class="bg-white shadow rounded-lg p-6">
        <h1 class="text-2xl font-bold mb-4">
            Our project
        </h1>
        <ul class="list-disc list-inside">
            @for(String pj : projectList)
                <li class="text-gray-600">${pj}</li>
            @endfor
        </ul>
    </div>
`)